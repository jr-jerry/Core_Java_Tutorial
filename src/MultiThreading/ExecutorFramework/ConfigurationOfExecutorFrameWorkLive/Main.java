package MultiThreading.ExecutorFramework.ConfigurationOfExecutorFrameWorkLive;

import java.util.concurrent.*;

public class Main {
            static void main(String[] args) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                        2,4,10, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2)
                );
                ExecutorService executorService = Executors.newFixedThreadPool(2);

                for(int i=1;i<=7;i++){
                    int taskId=i;
                    Runnable task=()->{
                        try {
                            Thread.sleep(3000);
                            System.out.println("Task perform of id "+taskId+" by Thread "+Thread.currentThread().getName());
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    };

                    threadPoolExecutor.execute(task);
        }
        threadPoolExecutor.shutdown();
    }
}
