package MultiThreading.ConcurrencyWithLock;

import java.util.concurrent.atomic.AtomicReference;

public class LockFree_Concurrency_with_retry {
    static void main(String[] args) throws InterruptedException {
        Counter_Resource resource = new Counter_Resource();
        Thread t1=new Thread(
                ()->{
                    resource.increment();
                }
        );
        t1.setName("aman-thread");

        Thread t2=new Thread(()->resource.increment());
        t2.setName("naman-thread");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count "+resource.get());
    }
}
class Counter_Resource{
    private AtomicReference<Integer> count=new AtomicReference<>(0);

    public void increment(){
        Integer value;
        while(true) {
            value = count.get();
            boolean not_updated = count.compareAndSet(value, value + 1);
            if (not_updated) {
                System.out.println(Thread.currentThread().getName()+" set value and exit :"+count.get());
                break;
            }
            System.out.println(Thread.currentThread().getName()+"detech changed in value and retry to update on latest ");
        }
    }
    public Integer get(){
        return count.get();
    }
}