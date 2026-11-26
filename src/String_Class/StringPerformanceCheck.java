package String_Class;

public class StringPerformanceCheck {
    static void main(String[] args) {
        String username="Aman";
        StringBuffer buffer=new StringBuffer(username);

        long startTime=System.currentTimeMillis();
        System.out.println("Program start at "+startTime);
        System.out.println("Thread Name: "+Thread.currentThread().getName());
        for(int i=1;i<=1000000000;i++){
           buffer.append("1");
        }
        long endTime=System.currentTimeMillis();
        System.out.println("Program end at "+endTime);

        System.out.println("Total time taken "+(endTime-startTime));
    }
}
