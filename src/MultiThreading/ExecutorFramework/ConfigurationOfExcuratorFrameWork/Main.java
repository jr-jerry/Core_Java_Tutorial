package MultiThreading.ExecutorFramework.ConfigurationOfExcuratorFrameWork;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    static void main() {
        try(ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(2,4,2, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2))){
            for(int i=1;i<=5;i++){
                int taskId=i;
                threadPoolExecutor.execute(()->{
                    try {
                        Thread.sleep(2000);
                        System.out.println("Task with taskId: "+taskId+" is perform by "+Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
