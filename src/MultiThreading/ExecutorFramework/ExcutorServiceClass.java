package MultiThreading.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorServiceClass {
    public static void main(String[] args) {
        ExecutorService executorService
                = Executors.newFixedThreadPool(2);
        for(int i=0;i<=15;i++){
            int taskNumber=i;
            Runnable taskRunnable=()->{
                System.out.println("Task"+taskNumber+" Peform by "+Thread.currentThread().getName());
            };
            executorService.execute(taskRunnable);
        }
        executorService.shutdown();
    }
}
