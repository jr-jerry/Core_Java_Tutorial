package Java8Features.Four_In_Built_Functional_Interface.Supplier_Functional_Interface;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main
{
    public static void main(String[] args)
    {
         Supplier<Integer> supplier_impl=new NumberImpl();
        System.out.println(supplier_impl.get());

        Supplier<String[]> supplier_impl2=new ArrayImpl();
        System.out.println(supplier_impl2.get());

        Supplier<String> supplier_impl3=()->{
            return "Ducat School of AI ";
        };
        System.out.println(supplier_impl3.get());
    }
}
class NumberImpl implements Supplier<Integer>{
    @Override
    public Integer get() {
        return 5;
    }
}
class ArrayImpl implements Supplier<String[]>{
    @Override
    public String[] get() {
        return new String[]{"gautam","amit","aryan","yulia"};
    }
}