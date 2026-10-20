package MultiThreading.Demo;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class AtomicReferenceClass {
    static void main(String[] args) throws InterruptedException {
        BookMyShowConcurrencyArray bookMyShow = new BookMyShowConcurrencyArray();

        Thread amit_thread_1=new Thread(()->{

                boolean seat_status=bookMyShow.BookSeat("amit");
                System.out.println("amit_thread_1 is seat status "+seat_status);


        });
        Thread sumit_thread_2=new Thread(()->{

                boolean seat_status=bookMyShow.BookSeat("sumit");
                System.out.println("sumit_thread_2 is seat status "+seat_status);

        });
        Thread gautam_thread_2=new Thread(()->{

            boolean seat_status=bookMyShow.BookSeat("gautam ");
            System.out.println("gautam_thread_2 is seat status "+seat_status);

        });
        amit_thread_1.setName("amit");
        sumit_thread_2.setName("sumit");
        gautam_thread_2.setName("gautam");
        sumit_thread_2.start();
        amit_thread_1.start();
        gautam_thread_2.start();

        amit_thread_1.join();
        sumit_thread_2.join();
        gautam_thread_2.join();

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
class BookMyShowConcurrencyArray{
    AtomicInteger nextSeat;
    AtomicReferenceArray<String> seats;

    public BookMyShowConcurrencyArray(){
        seats=new AtomicReferenceArray<>(10);
        nextSeat=new AtomicInteger(0);
    }

    public boolean BookSeat(String personName){
        while(true){
            int current_free_seat=nextSeat.get();
           if(nextSeat.compareAndSet(current_free_seat,current_free_seat+1)){
               seats.compareAndSet(current_free_seat,null,personName);
               System.out.println(Thread.currentThread().getName()+" occupy seat : "+current_free_seat);
               return true;
           }
            System.out.println(Thread.currentThread().getName()+" now try for seat :"+(current_free_seat+1));
        }
    }
}
