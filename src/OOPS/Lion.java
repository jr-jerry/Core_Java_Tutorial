package OOPS;

public class Lion   {
    static void main(String[] args) {
        Student abhishekObj=new Student();
        abhishekObj.studentName="Abhishek Mishra";
        abhishekObj.studentAge=26;
        abhishekObj.currentTechnology="Java";
        abhishekObj.Login();
        abhishekObj.scrollReel();
        abhishekObj.Logout();

        Student amanObj=new Student();
        amanObj.studentName="Aman Mishra";
        amanObj.studentAge=26;
        amanObj.currentTechnology="Java";
        amanObj.Login();
        amanObj.scrollReel();
        amanObj.Logout();

        System.out.println(abhishekObj.studentName+" "+abhishekObj.studentAge+" "+abhishekObj.currentTechnology);
    }
}
class Student{
    String studentName;
    int studentAge;
    String currentTechnology;

    public void scrollReel(){
        System.out.println(studentName+": Object Scroll Reel ");
    }
    public void Login(){
        System.out.println(studentName+": Object Login ");
    }
    public void Logout(){
        System.out.println(studentName+": Object Logout ");
    }
}