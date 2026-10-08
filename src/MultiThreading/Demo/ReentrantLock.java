package MultiThreading.Demo;

import java.util.concurrent.locks.Lock;

public class ReentrantLock {
    static void main(String[] args) {
        Lock lockType=new java.util.concurrent.locks.ReentrantLock();
        Resource resource=new Resource(lockType);
        Thread t1=new Thread(
                ()->resource.addItem()
        );
        Thread t2=new Thread(
                ()->resource.addItem()
        );
        Thread t3=new Thread(
                ()->resource.addItem()
        );
        t1.start();
        t2.start();
        t3.start();
    }
}
class Resource{
    private Lock lockRef;
    volatile private Integer item;
    public Resource(Lock lockRef){
        this.lockRef = lockRef;
        this.item = 0;
    }
    public void addItem(){
        lockRef.lock();
        System.out.println(Thread.currentThread().getName()+" enter in addItem");

        try{
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" exit from addItem");
        }finally{
            lockRef.unlock();
        }
    }
}
