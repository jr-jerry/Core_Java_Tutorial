package WE_21_Nov.Practise1;

public class CalculatorImpl_Class implements CalculatorInterf {
    @Override
    public int volume(int a, int b, int c) {
        return a*b*c;
    }
    @Override
    public void anotherMethod() {
        System.out.println("Default implementation by CalculatorImpl");
    }
//    @Override
//    public void antherMethod2(){
//        System.out.println("static method impl by CalculatorImpl");
//    }
}
