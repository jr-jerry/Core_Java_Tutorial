package WE_21_Nov.Practise1;

public interface CalculatorInterf {
   default void anotherMethod(){
       System.out.println("Default implementation");
   }
   static void antherMethod2(){
       System.out.println("static method");
   }
    int volume(int a,int b,int c);
}
