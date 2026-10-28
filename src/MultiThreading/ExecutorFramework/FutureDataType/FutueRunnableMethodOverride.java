package MultiThreading.ExecutorFramework.FutureDataType;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutueRunnableMethodOverride {
    static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            int taskId=i;

           Future<String> taskResult= executorService.submit(()->{
                System.out.println("Task with taskId : "+taskId+" completed By "+Thread.currentThread().getName());
            },"Done");

           if(taskResult.isDone()){
               System.out.println("Task with taskId : "+taskId+" completed By "+Thread.currentThread().getName()+" with predefined Result "+taskResult.get());
           };
        }
    }
}
