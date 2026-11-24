package Java8Features.IntroductionToLambda;

public class Practise_2_FunctionalInterface {
    static void main(String[] args) {
        Testable impl=new CustomNumber();
        System.out.println( impl.test(20));
    }
}
interface Testable{
    boolean test(int a);
}
class CustomNumber implements Testable{
    @Override
    public boolean test(int a) {
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }
}
/**
 * Testable functional Interface
 *  - boolean test(int a);
 *
 *  Class CustomNumber <--- Implement Testable
 *
 *  Main method
 *      Testable impl_1=new CustomNumber();
 *
 *      impl_1.test(10);
 */
