package OOPS.InheritencePrinciple;

public class MethodOverriding {
    static void main(String[] args) {
        Ferrari12 ferrari12 = new Ferrari12();
        ferrari12.start();
    }
}
class Car12{
    public void start(){
        System.out.println("Car start ! ");
    }
}
class Ferrari12 extends Car12{
    @Override
    public void start() {
        System.out.println("Ferrari start ! ");
    }
}