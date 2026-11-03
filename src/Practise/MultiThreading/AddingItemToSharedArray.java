package Practise.MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class AddingItemToSharedArray {
    static void main(String[] args) throws InterruptedException {
        ArrayResource arrayResource = new ArrayResource();
        Thread thread0=new Thread(()->{
            arrayResource.add("gautam");
        });
        Thread thread1=new Thread(()->{
            arrayResource.add("amit");
        });
        Thread thread3=new Thread(()->{
            arrayResource.add("saloni");
        });
         thread0.start();
         thread1.start();
         thread3.start();

         thread0.join();
         thread1.join();
         thread3.join();

         AtomicReferenceArray<String> atomicReferenceArray=arrayResource.get();

    }
}
class ArrayResource{
    private AtomicReferenceArray<String> atomicArray=new AtomicReferenceArray<>(10);
    private AtomicInteger freeIndex=new AtomicInteger(0);

    public void add(String personName){
        while(true) {
            int currentFreeIdx = freeIndex.get();
            if (freeIndex.compareAndSet(currentFreeIdx, currentFreeIdx + 1)) {
                if (atomicArray.compareAndSet(currentFreeIdx, null, personName)) {
                    System.out.println(personName + " is added at "+currentFreeIdx);
                    break;
                }
            }
            System.out.println("Thread try for new currentFreeIdx = " + currentFreeIdx);
        }
    }
    public AtomicReferenceArray<String> get(){
        return atomicArray;
    }
}
class Person{
   private  String name;
   private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
