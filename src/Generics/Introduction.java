package Generics;

public class Introduction {
    public static void main(String[] args) {
      FullTimeEmployee amitRef=new FullTimeEmployee("Amit",45000.0);
      PartTimeEmployee sumitRef=new PartTimeEmployee("Sumit",12.5f);

      Employee<FullTimeEmployee> emp1=new Employee<>();
      emp1.setEmp(amitRef);

      Employee<PartTimeEmployee> emp2=new Employee<>( );
      emp2.setEmp(sumitRef);
    }
}

/**
 * Class->Calculator
 *      sum -->generic sum function!
 */
class Employee<T>{
    private T emp;

    public void setEmp(T emp) {
        this.emp = emp;
    }
}
class FullTimeEmployee {
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FullTimeEmployee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    private String name;
    private Double salary;
}
class PartTimeEmployee{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Float workingHours) {
        this.workingHours = workingHours;
    }

    private String name;
    private Float workingHours;
    public PartTimeEmployee(String name, Float workingHours) {
        this.name = name;
    }
}