package OOPS_WD.Abstraction;

public class DemoChild extends Demo{
    @Override
    public void abstractMethod() {
        System.out.println("Implementation in DemoChild of abstractMethod");
    }

    public static void normalMethod() {
        System.out.println("Implementation in DemoChild normalMethod");
    }


    public void methodNew(){
        System.out.println(" DemoChild methodNew");
    }
}