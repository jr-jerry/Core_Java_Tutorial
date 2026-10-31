package OOPS.PolyMorphism;

public class MethodOverloading {
    static void main(String[] args) {
        Calculator calculatorRef=new Calculator();

        int result_interger=calculatorRef.sum(10,20);
        double result_double=calculatorRef.sum(10.01,20.22);
        String result_string=calculatorRef.sum("gautam","Java");
    }
}
class Calculator{
    public int sum(int a,int b){
        return a+b;
    }
    public double sum(double a,double b){
        return a+b;
    }
    public String sum(String a,String b){
        return a+b;
    }
}