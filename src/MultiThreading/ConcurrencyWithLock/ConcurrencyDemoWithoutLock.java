package MultiThreading.ConcurrencyWithLock;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrencyDemoWithoutLock {
    static void main(String[] args) throws InterruptedException {
        ResourceConcurrencyWithAtomicInteger resource=new ResourceConcurrencyWithAtomicInteger();
        System.out.println("program start time "+new Date(System.currentTimeMillis()).getTime());
        Thread thread_1=new Thread(
                ()->{
                    for(int i=0;i<1000;i++)
                    resource.increament();
                }
        );
        Thread thread_2=new Thread(
                ()->{
                    for(int i=0;i<1000;i++)
                        resource.increament();
                }
        );

        thread_1.start();
        thread_2.start();


        thread_1.join();
        thread_2.join();

        System.out.println(resource.getCount());
        System.out.println("program end time "+new Date(System.currentTimeMillis()).getTime());

    }
}
class Resource{
    private Integer count;
    public Resource(){
        this.count=0;
    }
    public  void increament(){
        this.count++;
    }
    public Integer getCount(){
        return this.count;
    }
}
class ResourceConcurrencyWithAtomicInteger{
    private AtomicInteger count;
    public ResourceConcurrencyWithAtomicInteger(){
        this.count=new AtomicInteger(0);
    }
    public  void increament(){
        count.getAndIncrement();
    }
    public Integer getCount(){
        return this.count.get();
    }
}
