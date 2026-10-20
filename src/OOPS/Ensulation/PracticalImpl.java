package OOPS.Ensulation;

public class PracticalImpl {
    static void main(String[] args) {
        Programmer aashwin=new Programmer();
        aashwin.setName("Ashwin");
        aashwin.setAge(19);
        aashwin.setLanguage("phython");
//        aashwin.name="Aashwin";

        Programmer gautam=new Programmer();
        gautam.setName("gautam");
        gautam.setAge(aashwin.getAge());
        gautam.setLanguage(aashwin.getLanguage());

        System.out.println(gautam.getName()+" "+gautam.getAge()+" "+gautam.getLanguage());
    }
}
class Programmer{
    private String name;
    private String language;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }





}