package OOPS.AbstractionPractise.InterfaceIntro;

//abstract class <---Represent Group of Common Classess
public abstract class Animal {
    public abstract void sleep() ;
}
interface Huntable{
    void hunt();
}
class Lion extends Animal implements Huntable{
    @Override
    public void sleep(){
        System.out.println("Lion sleep");
    }

    @Override
    public void hunt() {
        System.out.println("Lion hunt");
    }
}
class Cow extends Animal{
    @Override
    public void sleep() {
        System.out.println("Cow sleep");
    }
}