package OOPS.Contructor;

import java.util.Scanner;

public class Introduction {
    static void main(String[] args) {
        User userAmanObj_Ref=new User("Aman",24);
        User userAmanCopyObj_Ref=new User(userAmanObj_Ref);

        System.out.println("Copy: Object properties  age "+userAmanCopyObj_Ref.age+" name "+userAmanCopyObj_Ref.name);
    }
}
class User{
    String name;
    int age;
    public User(String name,int age){
        this.name=name;
        this.age=age;
    }
    public User(User prevObj){
        this.name=prevObj.name;
        this.age=prevObj.age;
    }
    public User(){
        System.out.println("Default constructor called ! ");
        name=null;
    }
}
/**
 * Class-->Employee
 * Field-->empName,empSalary,empYOE
 * Methods-->Params Constructor,Copy Constructor !
 *
 * Object-> Gautam,Naman, CopyNaman
 */
