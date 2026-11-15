package OOPS.InheritencePrinciple;

public class EmployeeExp {
    static void main(String[] args) {
        Employee12 permanentEmp=new PermanentEmployee12();
        permanentEmp.calculateSalary(100);

        Employee12 employee =new TemporaryEmployee12();
        employee.calculateSalary(100);

        System.out.println("Perm: "+permanentEmp.getSalary()+" freelance "+employee.getSalary());
    }
}
class Employee12{
    public double getSalary() {
        return salary;
    }

    private double salary;
    public void calculateSalary(int workingDay){
         salary=workingDay*1000;
    }
    public void displaySalary(){
        System.out.println(salary);
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
}
class PermanentEmployee12 extends Employee12{

}
class TemporaryEmployee12 extends Employee12{
    @Override
    public void calculateSalary(int workingDay) {
        setSalary(workingDay*2500);
    }
}