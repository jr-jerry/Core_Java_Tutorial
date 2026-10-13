package MultiThreading.Demo;

import java.util.concurrent.locks.StampedLock;

public class StampedLockDemo {
    static void main(String[] args) {
        CricticalResource cricticalResource=new CricticalResource();
        Thread t0=new Thread(()->{
            cricticalResource.readValue();
        });
        Thread t1=new Thread(()->{
            cricticalResource.writeValue();
        });
        t0.start();
        t1.start();
    }
}
class CricticalResource{
    private StampedLock stampedLock;
    private Integer value;
    public CricticalResource( ){
        this.value=0;
        this.stampedLock=new StampedLock();
    }
    public void writeValue(){
        Long stamp=stampedLock.writeLock();
        try{
            int init=this.value;
            this.value++;
            System.out.println(Thread.currentThread().getName()+" modify from "+init+" to "+this.value);

        }finally {
            stampedLock.unlockWrite(stamp);
        }
    }
    public void readValue(){
        Long stamp=stampedLock.tryOptimisticRead();
        try {
            System.out.println(Thread.currentThread().getName()+" goes to sleep with stamp "+stamp);
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int v=value;
            if(stampedLock.validate(stamp)==false){
                stamp=stampedLock.readLock();
                try{
                    v=value;
                    System.out.println(Thread.currentThread().getName()+" wake up from sleep with stamp "+stamp);

                }finally {
                    stampedLock.unlockRead(stamp);
                }
            }
        System.out.println("Read value : "+v);
    }
}
