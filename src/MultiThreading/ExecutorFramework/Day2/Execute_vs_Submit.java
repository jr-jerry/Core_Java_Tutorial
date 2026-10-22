package MultiThreading.ExecutorFramework.Day2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Execute_vs_Submit {
    static void main(String[] args) {
        try(ExecutorService executorService= Executors.newFixedThreadPool(2)){
            Callable<Integer> callableImpl=()->{
                throw new ArithmeticException();
            };
            Future<Integer> futureInteger=executorService.submit(callableImpl);
            futureInteger.get();
        }catch(Exception e){
            System.out.println("arithmetic exception caught in main thread");
        }
    }
}
