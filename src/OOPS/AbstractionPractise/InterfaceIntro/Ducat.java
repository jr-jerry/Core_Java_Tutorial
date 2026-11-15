package OOPS.AbstractionPractise.InterfaceIntro;

public class Ducat {
    static void main() {
        Person namanObjRef=new Person("Naman",22);
        namanObjRef.highJump();
    }
}
class Person implements JumpAble,sumAble{
    String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int age;


    @Override
    public void highJump() {
        System.out.println(this.name+" perform high jump ");
    }

    @Override
    public void sumDeep() {
        System.out.println(this.name+" perform sum deep ");
    }
}
interface sumAble{
    void sumDeep();
}
interface JumpAble{
    void highJump();
}

class LivingOrganism{

}

