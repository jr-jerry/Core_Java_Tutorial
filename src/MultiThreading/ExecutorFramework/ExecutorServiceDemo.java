package MultiThreading.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    static void main() {
        ExecutorService executorServiceFixedThreadPool= Executors.newFixedThreadPool(2);
        for(int i=0;i<5;i++) {
            int taskNumber=i;
            executorServiceFixedThreadPool.submit(()->{
                System.out.println(taskNumber+" Peform by "+Thread.currentThread().getName());
            });
        }
        executorServiceFixedThreadPool.shutdown();
    }
}
