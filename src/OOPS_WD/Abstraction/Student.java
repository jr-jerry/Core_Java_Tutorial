package OOPS_WD.Abstraction;

public class Student {
    //instance method
    public void m1(){
        System.out.println("Method 1 of Student ");
    }
    public static void m2(){
        System.out.println("static Method 2 of Student ");
    }

    public static void main(String[] args){
        Student aman=new Student();
        aman.m1();
        Student.m2();
    }
}
