package OOPS;

import java.util.Scanner;

public class CopyConstructor {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input1_salary;
        String input2_name;
        int input3_yoe;

        System.out.println("Enter your name ");
        input2_name=sc.nextLine();
        System.out.println("enter your salary");
        input1_salary=sc.nextInt();
        System.out.println("enter your yoe");
        input3_yoe=sc.nextInt();
        sc.nextLine();

        Employee emp1=new Employee(input2_name,input1_salary,input3_yoe);

        System.out.println("Enter your name ");
        input2_name=sc.nextLine();
        System.out.println("enter your salary");
        input1_salary=sc.nextInt();
        System.out.println("enter your yoe");
        input3_yoe=sc.nextInt();

        Employee emp2=new Employee(input2_name,input1_salary,input3_yoe);

        System.out.println("emp1: "+emp1.empName+" salary :"+emp1.empSalary+" yoe "+emp1.empYOE);
        System.out.println("emp2: "+emp2.empName+" salary :"+emp2.empSalary+" yoe "+emp2.empYOE);

        Employee emp2_copy=new Employee(emp2);
        emp2_copy.empName="gautam";
        System.out.println("emp2_copy: "+emp2_copy.empName+" yoe "+emp2_copy.empYOE+" salary :"+emp2_copy.empSalary);

    }
}
//State -->Field of object
class Employee{
    String empName;

    public Employee(String empName, int empSalary, int empYOE) {
        this.empName = empName;
        this.empSalary = empSalary;
        this.empYOE = empYOE;
    }
    public Employee(Employee emp){
        this.empSalary=emp.empSalary;
        this.empYOE=emp.empYOE;
    }

    int empSalary;
    int empYOE;



}