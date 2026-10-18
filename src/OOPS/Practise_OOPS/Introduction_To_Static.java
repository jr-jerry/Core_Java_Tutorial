package OOPS.Practise_OOPS;

public class Introduction_To_Static {
    static void main(String[] args) {
        Student aman_Ref=new Student(1,"aman",12,"DPS");
        Student naman_Ref=new Student(2,"naman",13,"DPS");
        Student vishal_Ref=new Student(3,"vishal",8,"Sunbeam");
        Student rohan_Ref=new Student(4,"rohan",9,"SpringDos");

        System.out.println(aman_Ref);
        System.out.println(naman_Ref);
        System.out.println(vishal_Ref);
        System.out.println(rohan_Ref);
    }
}
class Student{
    int id;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clss=" + clss +
                '}'+" school name "+schl_nm;
    }

    public Student(int id, String name, int clss, String school_nm) {
        this.id = id;
        this.name = name;
        this.clss = clss;
         schl_nm = school_nm;
    }

    int clss;
   static  String schl_nm;
}
