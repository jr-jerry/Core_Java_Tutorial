package MultiThreading.Practise1_Solution;

public class Main {
    static void main() throws InterruptedException {
        Stock stock=new Stock();
        Thread t1=new Thread(
                ()->{
                    try {
                        for(int i=1;i<=6;i++)
                            stock.addItem();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
        Thread t2=new Thread(
                ()->{
                    try{
                        for(int i=1;i<=3;i++){
                            stock.consumeItem();;
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("After completion "+stock.getItem());
    }
}
class Stock{
    volatile  private Integer Item;
    volatile  private Boolean isAvailable;
    public Stock(){
        this.isAvailable=false;
        this.Item=0;
    }
    public Integer getItem() {
        return Item;
    }
    public synchronized  void addItem() throws InterruptedException {
        while(isAvailable){
            wait();
        }
        this.Item+=5;
        System.out.println("5 item added By Producer Thread ");
        if(this.Item==10){
            this.isAvailable=true;
            notifyAll();
        }

    }
    public synchronized void consumeItem() throws InterruptedException {
        while(!isAvailable){
            wait();
        }
        System.out.println("10 item consumed by consumer thread ");
        this.Item-=10;
        if(this.Item==0){
            isAvailable=false;
            notifyAll();
        }
    }
}
