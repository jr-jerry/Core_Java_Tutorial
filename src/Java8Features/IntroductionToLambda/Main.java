package Java8Features.IntroductionToLambda;

import java.io.Serializable;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    static void main(String[] args) {
        FunctionalInterface functionalInterfaceImpl_1=new FunctionalInterfaceImpl();
        functionalInterfaceImpl_1.only1AbstractMethod();
    }
}

interface FunctionalInterface {
    void only1AbstractMethod();
}
class FunctionalInterfaceImpl implements FunctionalInterface {
    @Override
    public void only1AbstractMethod() {
        System.out.println("only1AbstractMethod implemented in FunctionalInterfaceImpl Class ");
    }
}
