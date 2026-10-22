package MultiThreading.ExecutorFramework.Day2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable_call_method {
    static void main(String[] args) {
        try (ExecutorService executorService = Executors.newFixedThreadPool(2)) {

            Future<Integer> i;
            try {
                i = executorService.submit(() -> {
                    System.out.println("task start");
                    System.out.println("task completer");
                    System.out.println("task result return to i variable");
                    return 10;
                });
                System.out.println("i variable " + i.get());

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
        }
    }
}
