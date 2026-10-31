package OOPS.PolyMorphism;

public class UseCaseMethodOverLoading {
    static void main(String[] args) {
        Person p1=new Person("Gautam") ;
        Person p2=new Person("David",21);
        Person p3=new Person("Naman",19,5.7);
    }
}
class Person{
    //Constructor Overloading!
    String name;
    int age;
    double height;

    public Person(String name,int age,double height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
        this.height=0.0;
    }
    public Person(String name){
        this.name=name;
        this.age=0;
        this.height=0.0;
    }
}
