package OOPS.InheritenceV2;

public class UnderStandingConstructorBehavior {
    static void main(String[] args) {

        Father2 father2 = new Father2();
        father2.gold=24;
        System.out.println(father2.gold);

    }
}
class Father2{
public int getGold() {
    return gold;
}
public void setGold(int gold) {
    this.gold = gold;
}

protected int gold;
public Father2(){
    System.out.println("Father2 constructor");
    this.gold = 0;
}
}
class Child2 extends Father2{
    public int getSilver() {
        return silver;
    }
    public void setSilver(int silver) {
        this.silver = silver;
    }
    public int getGoldByChild(){
        return gold;
    }
    private int silver;

    public Child2() {
        System.out.println("Child2 constructor");
        this.silver = 0;
    }
}
