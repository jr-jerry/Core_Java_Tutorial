package MultiThreading.Demo.Practise.Future_Callable_Executor_Serivce.TypeOfThreadPool;

import java.util.concurrent.*;

public class Main {
    static void main(String[] args) {
                // 2. Created normally without try-with-resources to keep it alive
                ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

                try {
                    for (int i = 1; i < 10; i++) {
                        int taskId = i;
                        executorService.scheduleAtFixedRate(() -> {
                            try {
                                System.out.println(taskId + " task perform by thread " + Thread.currentThread().getName());
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }, 1, 2, TimeUnit.SECONDS);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                // Note: Do not call executorService.shutdown() here immediately,
                // otherwise it will stop the recurring schedule just like before.

    }
}
