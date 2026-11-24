package Java8Features.Four_In_Built_Functional_Interface;

import java.util.function.Predicate;

public class Main {
    static void main(String[] args) {
        Person001 p1=new Person001("Amit",17);
        Person001 p2=new Person001("Gautam",24);

        Predicate<Person001> predicateImpl=(obj)->{
            if(obj.getAge()>18){
                return true;
            }else{
                return false;
            }
        };

        System.out.println("predicateImpl.test(p2) "+predicateImpl.test(p2));

        /**
         * In Build Functional Interface hote hai !
         * 1. Predicate Functional Interface
         * 2. Function Functional Interface-->transformation ! -->data-->transform -->another data
         * 3. Consumer Functional Interface
         * 4. Supplier Functional Interface
         */
    }
}
class Person001  {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;
    public Person001(){

    }
    public Person001(String name, int age) {
        this.name = name;
        this.age = age;
    }


}