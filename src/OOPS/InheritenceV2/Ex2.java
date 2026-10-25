package OOPS.InheritenceV2;

public class Ex2 {
    static void main() {
        Child child = new Child();
        child.passionpro();
    }
}
class GrandFather{
    public void scooter(){
        System.out.println("GrandFather's scooter start");
    }
}
class Father extends GrandFather{
    public void passionpro(){
        System.out.println("Father's passionpro start");
    }
}
class Child extends Father{

}