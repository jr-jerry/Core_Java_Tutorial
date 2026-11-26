package String_Class;

public class Multi_Threading_Environment {
    static void main(String[] args) throws InterruptedException {
        StringBuilder buffer=new StringBuilder("1");
        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                buffer.append("1");
            }
        });

        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++){
                buffer.append("1");
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(buffer.toString().length());
    }
}
