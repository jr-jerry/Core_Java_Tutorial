package Java8Features.Four_In_Built_Functional_Interface.ConsumerFunctionalInterface;

import java.util.function.Consumer;

public class Main {
    static void main(String[] args) {
       Consumer<String> consumer_impl=new ConsumerJustPrint_Impl();
       consumer_impl.accept("gautam");
    }
}
class ConsumerJustPrint_Impl implements Consumer<String>{
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
