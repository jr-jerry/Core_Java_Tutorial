package OOPS.AbstractionPractise.InterfaceIntro;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.util.function.Consumer;

public class MainClass
{
    public static void main(String[] args)
    {
//        Consumer
        B b = new A();
        System.out.println(b.methodB(-2));
    }
}
class A implements B
{
    public int methodB(int i)
    {
         i =  - i * i;
         return i;
    }
}

interface B
{
    int methodB(int i);
}
