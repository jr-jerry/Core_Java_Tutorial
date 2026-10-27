package Array.Util;

import java.util.Arrays;

public class ArrayUtilClass {
    static void main(String[] args) {
        Person mayanObj=new Person();

        mayanObj.name="Mayank Singh";
        mayanObj.age=18;
        mayanObj.height=5.1;

        Person amanObj=new Person();
        amanObj.name="Aman Singh";
        amanObj.age=18;
        amanObj.height=5.1;

        System.out.println(mayanObj.name+" "+mayanObj.age+" "+mayanObj.height);
        System.out.println(amanObj.name+" "+amanObj.age+" "+amanObj.height  );


    }
}
class Person{
    String name;
    int age;
    double height;

    public void sleep(){
        System.out.println("Sleeping ... ");
    }
}
