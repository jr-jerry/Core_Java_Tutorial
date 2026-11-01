package MultiThreading.ThreadSafetyDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
public class Main {
    static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread start ");
        Resource111 resource111ObjRef=new Resource111();

        Runnable task1=()->{
            for(int i=1;i<=1000;i++){
                resource111ObjRef.addElement(1);
            }
        };
        Thread t1=new Thread(task1);
        t1.start();
        System.out.println("Main thread wait till t1 complete its task ");
        t1.join();
        Thread t2=new Thread(task1);
        t2.start();

        System.out.println("Main thread wait till t2 complete its task ");
        t2.join();

        System.out.println("List.size : "+resource111ObjRef.getListSize());

        System.out.println("Main Thread End");
    }
}
class Resource111{
    private List<Integer> list=new Vector<>();
    public void addElement(int data){
        this.list.add(data);
    }
    public int getListSize(){
        return this.list.size();
    }
}