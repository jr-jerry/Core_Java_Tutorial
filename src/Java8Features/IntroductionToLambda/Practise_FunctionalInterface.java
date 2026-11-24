package Java8Features.IntroductionToLambda;

public class Practise_FunctionalInterface {
    static void main(String[] args) {
        Calculator impl_1=new SumImpl();
        Calculator impl_2=new MultiplyImpl();

        System.out.println(impl_1.calculate(4,5));
        System.out.println(impl_2.calculate(4,5));
    }
}
interface Calculator{
    int calculate(int a, int b);
}
class SumImpl implements Calculator{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
class MultiplyImpl implements Calculator{
    @Override
    public int calculate(int a, int b) {
        return a*b;
    }
}
/**
 * Create a Functional Interface
 *  - Calculator
 *      1 . abstract method : int calculate(int a,int b);
 *
 * Create two Implementation of this Calculator Functional Interface
 *  class SumImpl <-- implement Calculator
 *   - provide implement of calculate Method
 *
 *   class MultiplicationImpl <-- implement Calculator
 *   - provide implement of calculate Method
 *
 *   In main method
 *      Calculator impl_1=new SumImpl();
 *      Calculator impl_2=new MultiplicationImpl();
 *
 *      print--> impl_1.calculate(4,5);
 *
 *      print--> impl_2.calculate(4,5);
 */
