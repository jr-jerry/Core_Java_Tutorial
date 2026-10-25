package OOPS.InheritenceV2;
public class InheritenceIntroduction {
    static void main() {

    }
}
class Animal{
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    private String color;

    public void eat(){
        System.out.println("Animal is eating");
    }
}
class Cat extends Animal {

}
class Dog extends Animal  {

}