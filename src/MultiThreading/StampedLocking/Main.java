package MultiThreading.StampedLocking;

import java.util.concurrent.locks.StampedLock;

public class Main {
    static void main(String[] args) throws InterruptedException {
        Resource resource=new Resource();
        Thread thread0=new Thread(()->{
            resource.updateCount();
        });

        Thread thread1=new Thread(()->{
            resource.updateCount();
        });
        thread0.start();
        thread1.start();

        thread0.join();
        thread1.join();
        System.out.println(resource.getCount());
    }
}
class Resource{
    private StampedLock lock;

    public Integer getCount() {
        return count;
    }

    private Integer count;

    public Resource( ) {
        this.lock = new StampedLock();
        count=0;
    }
    public void updateCount(){
        Long stampId=lock.writeLock();
        System.out.println(Thread.currentThread().getName()+"aquire lock with stampId "+stampId);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try{
            int value=this.count;
            this.count++;
            System.out.println(Thread.currentThread().getName()+" change count from "+value+" to "+this.count);

        }finally{
            System.out.println(Thread.currentThread().getName()+"remove lock with stampId "+stampId);
            lock.unlockWrite(stampId);
        }
    }

}