package WE_21_Nov.Practise1;

public class CalculatorMain extends Object{

    static void main(String[] args) {
        CalculatorInterf interf = (a1,b1,c1)->a1*b1*c1;

        System.out.println(interf.volume(4,4,4));
        interf.anotherMethod();
    }
}
