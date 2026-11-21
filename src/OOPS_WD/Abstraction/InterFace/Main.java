package OOPS_WD.Abstraction.InterFace;

public class Main {
    static void main(String[] args) {
        Sparrow ref=new Sparrow();
        ref.sing();
    }
}
interface Flyable{
    void fly();
}
interface Singing{
    void sing();
}
class Sparrow implements Flyable,Singing{
    @Override
    public void fly() {
        System.out.println("Sparrow fly ");
    }

    @Override
    public void sing() {
        System.out.println("Sparrow sing");
    }
}
