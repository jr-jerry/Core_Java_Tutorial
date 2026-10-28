package OOPS.InheritencePrinciple;

public class Main {
    static void main() {
        Child child = new Child( );
        child.car();
    }
}
class Parent{
    String gold;
    public Parent(){
        gold="0";
        System.out.println("Parent Constructor call");
    }
    public void car(){
        System.out.println("Parent car start");
    }
}
class Child extends Parent {
    public Child(){
        super();
        System.out.println("Child Constructor call");
        this.silver="0";
    }
    private String silver;
    public void setSilver(String silver){
        this.silver = silver;
    }
}
class GrandChild extends Child{

}