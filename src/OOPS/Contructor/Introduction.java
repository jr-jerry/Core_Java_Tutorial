package OOPS.Contructor;

import java.util.Scanner;

public class Introduction {
    static void main(String[] args) {
        User user=new User();
        System.out.println("User name "+user.getName()+" user age "+user.getAge());
    }
}
class User{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private int age;
    private char gender;
    //Default Constructor!
    public User(){
        this.name="";
        this.age=0;
        this.gender='M';
    }
}