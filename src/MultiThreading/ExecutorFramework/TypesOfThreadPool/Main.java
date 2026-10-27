package MultiThreading.ExecutorFramework.TypesOfThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i=1;i<=1000000;i++){
            int taskId=i;

            Runnable task=()->{
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task "+taskId+" perform by Thread "+Thread.currentThread().getName());
            };
            executorService.execute(task);
        }
        executorService.shutdown();
    }
}
