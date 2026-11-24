package Java8Features.Four_In_Built_Functional_Interface.Function_Functional_Interface;

import java.util.function.Function;

public class Main {
    static void main(String[] args) {
        String s1="gautam";
//        "gautam"-->6
        Function<String,Integer> functionImpl=(s)->{
            return s.length();
        };

        System.out.println("functionImpl.apply(s1) "+ functionImpl.apply(s1));
    }
}
