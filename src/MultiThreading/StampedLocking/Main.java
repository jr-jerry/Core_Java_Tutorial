package MultiThreading.StampedLocking;

import java.util.concurrent.locks.StampedLock;

public class Main {
    static void main(String[] args) throws InterruptedException {
        Resource resource=new Resource();

        Thread read1=new Thread(()->{resource.readCount();});
        read1.setName("read1");

        Thread thread0=new Thread(()->{
            resource.updateCount();
        });

        read1.start();
        thread0.start();

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
    public void readCount(){
        Long stampId=lock.tryOptimisticRead();

        try {
            System.out.println(Thread.currentThread().getName()+" goes to sleep with stampId "+stampId);
            Thread.sleep(2000);
            int v=0;
            if(lock.validate(stampId)==false){
                stampId=lock.readLock();
                try{
                    v=this.count;
                    System.out.println(Thread.currentThread().getName()+" read value "+ v+"With stampId "+stampId);

                }finally {
                    lock.unlockRead(stampId);
                }
            }
            System.out.println(Thread.currentThread().getName()+" read value  "+v+"with stampId "+stampId);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

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