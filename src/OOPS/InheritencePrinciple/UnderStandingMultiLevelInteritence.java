package OOPS.InheritencePrinciple;

public class UnderStandingMultiLevelInteritence {
    static void main(String[] args) {
//        multi level Inheritence
    }
}
//Diamond Problem
class Car {
    public void stop(){
        System.out.println("Car stop ");
    }
    public void start(){
        System.out.println("Car start ");
    }
}
class Ferrari extends Car {

}
class Neno extends Car{

}