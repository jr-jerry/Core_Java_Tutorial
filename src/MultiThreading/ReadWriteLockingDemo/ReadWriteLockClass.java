package MultiThreading.ReadWriteLockingDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockClass {
    static void main() {
        Resource resource=new Resource();
        Thread t0 = new Thread(() -> {resource.writeData();});

        Thread t1 = new Thread(() -> {resource.writeData();});

        Thread t2 = new Thread(() -> {resource.readDataf();});
        Thread t3 = new Thread(() -> {resource.readDataf();});
        t2.start();
        t3.start();
        t0.start();
        t1.start();

    }
}
class Resource{
    private Integer value;
    private ReadWriteLock rwlock;
    private Lock readLock;
    private Lock writeLock;

    public Resource(){
        this.value=0;
        this.rwlock=new ReentrantReadWriteLock();
        this.readLock=rwlock.readLock();
        this.writeLock=rwlock.writeLock();
    }
    public void readDataf(){
        readLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+"Enter into read block "+this.value);


        }finally {
            System.out.println(Thread.currentThread().getName()+"Exiting read block ");
            readLock.unlock();
        }
    }
    public void writeData(){
        writeLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" enter into writeData block ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            value++;
        }finally {
            System.out.println(Thread.currentThread().getName()+" exit from writeData block ");
            writeLock.unlock();
        }
    }
}
