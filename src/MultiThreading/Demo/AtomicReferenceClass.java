package MultiThreading.Demo;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceClass {
    static void main(String[] args) throws InterruptedException {
        BookMyShowConcurrency bookMyShow = new BookMyShowConcurrency();
        Thread amit_thread_1=new Thread(()->{

                boolean seat_status=bookMyShow.BookSeat("amit");
                System.out.println("amit_thread_1 is seat status "+seat_status);


        });
        Thread sumit_thread_2=new Thread(()->{

                boolean seat_status=bookMyShow.BookSeat("sumit");
                System.out.println("sumit_thread_2 is seat status "+seat_status);

        });
        sumit_thread_2.start();
        amit_thread_1.start();
        amit_thread_1.join();
        sumit_thread_2.join();

    }
}
class BookMyShow{
    String seat;
    public BookMyShow(){
        seat=new String("EMPTY");
    }
    public boolean BookSeat(String personName){
        if(seat.equals("EMPTY")){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            seat=new String(personName);
            return true;
        }
        return false;
    }
}
class BookMyShowConcurrency{
    AtomicReference<String> seat;
    public BookMyShowConcurrency(){
        seat=new AtomicReference<>("EMPTY");
    }
    public boolean BookSeat(String personName){
        if(seat.get().equals("EMPTY")==false){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return false;
        }
        return seat.compareAndSet("EMPTY",personName);
    }
}
