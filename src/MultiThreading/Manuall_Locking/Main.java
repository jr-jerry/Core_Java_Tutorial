package MultiThreading.Manuall_Locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static void main(String[] args) {
        Lock lockRef=new ReentrantLock(true);
        Resource resource=new Resource(lockRef);
        Thread thread1=new Thread(
                ()->resource.addItem()
        );
        thread1.setName("thread1");
        Thread thread2=new Thread(
                ()->resource.addItem()
        );
        thread2.setName("thread2");
        Thread thread3=new Thread(
                ()->resource.addItem()
        );

        Thread reader4=new Thread(()->resource.readItem());
        reader4.setName("reader4");

        Thread reader5=new Thread(()->resource.readItem());
        reader5.setName("reader5");

        Thread reader6=new Thread(()->resource.readItem());
        reader6.setName("reader6");

        thread3.setName("thread3");
        thread1.start();
        thread2.start();
        thread3.start();

        reader4.start();
        reader5.start();
        reader6.start();

    }
}
class Resource{
    private final Lock lockRef;
    private Integer item;

    public Resource(Lock lockRef)
    {
        this.lockRef = lockRef;
        this.item=0;
    }

    public void addItem()  {
        lockRef.lock();

        try{
            System.out.println(Thread.currentThread().getName()+" enter in AddItem");
            this.item++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" exit  from AddItem");
        }finally {
            lockRef.unlock();
        }
    }
    public void readItem(){
        lockRef.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" enter to : read "+item);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(Thread.currentThread().getName()+" exit: after read "+item);

            lockRef.unlock();
        }
    }
}
