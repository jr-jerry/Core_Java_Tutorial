package MultiThreading.Demo.Submit_vs_Execute;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    static void main(String[] args) {
       try(ExecutorService executorService = Executors.newFixedThreadPool(5);) {
           Callable<Integer> runnable = () -> {
              throw new RuntimeException();
           };
           Future<Integer> futureValue=executorService.submit(runnable);
           futureValue.get();
       }catch(Exception e){
           System.out.println("caught exception");
       }
    }
}
