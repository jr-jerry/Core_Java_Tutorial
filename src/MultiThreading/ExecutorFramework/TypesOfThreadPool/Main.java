package MultiThreading.ExecutorFramework.TypesOfThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        for(int i=1;i<=1;i++){
            int taskId=i;

            Runnable task=()->{

                System.out.println("Task "+taskId+" perform by Thread "+Thread.currentThread().getName());
            };
            executorService.scheduleAtFixedRate(task,0,5, TimeUnit.SECONDS);
        }
//        executorService.shutdown();
    }
}
