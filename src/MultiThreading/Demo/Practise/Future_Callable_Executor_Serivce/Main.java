package MultiThreading.Demo.Practise.Future_Callable_Executor_Serivce;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    static void main(String[] args) {
        try (ExecutorService executorService = Executors.newFixedThreadPool(2);) {
            Future<Integer> futureComptabileVar = executorService.submit(() -> {
                System.out.println("after 3 sec thread will value after performing task");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return 5;
            });
            System.out.println("before moving towards next line the .get() method of futureComptabileVar will hold main thread to block state");
            try {
                System.out.println("FutureComptabileVar.get() " + futureComptabileVar.get());
            } catch (Exception e) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
