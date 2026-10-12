package MultiThreading.Demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {
    static void main(String[] args) {
        CricticalSection resource = new CricticalSection();
        Thread w1=new Thread(
                ()->{
                    resource.writeValue(1);
                }
        );
        w1.setName("w1-thread");
        Thread w2=new Thread(
                ()->{
                    resource.writeValue(2);
                }
        );
        w2.setName("w2-thread");
        Thread r1=new Thread(
                ()->{
                    resource.readValue();
                }
        );
        r1.setName("r1-thread");
        Thread r2=new Thread(
                ()->{
                    resource.readValue();
                }
        );
        r2.setName("r2-thread");
        r1.start();
        r2.start();
        w1.start();
        w2.start();

    }
}
class CricticalSection{
    private Integer value;
    private ReadWriteLock rwlock;
    private Lock readLock;
    private Lock writeLock;
    public CricticalSection(){
        value=0;
        rwlock=new ReentrantReadWriteLock();
        readLock=rwlock.readLock();
        writeLock=rwlock.writeLock();
    }

    public void readValue(){
        readLock.lock();
        try{

            System.out.println(Thread.currentThread().getName()+" read "+value);
        }finally{
            readLock.unlock();
        }
    }
    public void writeValue(Integer newValue){
        writeLock.lock();
        try{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            value=newValue;
            System.out.println(Thread.currentThread().getName()+" write "+newValue);
        }finally {
            writeLock.unlock();
        }
    }
}