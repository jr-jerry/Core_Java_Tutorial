package OOPS.ClassAndObject;

import java.util.Scanner;

public class PersonPractisee {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person3 vanshObjRef=new Person3();
        System.out.println("Enter first person name");
        vanshObjRef.name=input.nextLine();
        System.out.println("Enter Second person name");

        Person3 mayankObjRef=new Person3();
        mayankObjRef.name=input.nextLine();

        vanshObjRef.eat();
        vanshObjRef.study();
        vanshObjRef.study();
        vanshObjRef.sleep();

        mayankObjRef.sleep();
        mayankObjRef.eat();
        mayankObjRef.sleep();
        mayankObjRef.study();
    }
}
class Person3{
    String name;
    public void eat(){
        System.out.println(name+" eat food ");
    }
    public void study(){
        System.out.println(name+" study ");
    }
    public void sleep(){
        System.out.println(name+" sleep ");
    }
}