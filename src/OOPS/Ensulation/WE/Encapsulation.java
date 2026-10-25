package OOPS.Ensulation.WE;

public class Encapsulation {
    static void main(String[] args) {
        Programmer amitRef=new Programmer();
        amitRef.setName("Amit kumrrr");
        amitRef.setAge(24);

        Developer amitDev=new Developer();

        amitDev.setName(amitRef.getName());
        amitDev.setTechnology("Java full Stack");

        System.out.println("Amit Dev: "+amitDev.getName()+" amit technology: "+amitDev.getTechnology());


    }
}
class Developer{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    private String name;
    private String technology;

}
class Programmer{
   private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

   public String getName(){
       return name;
   }
   public void setName(String name){
       if(name!=null && name.length()>3 && name.trim().length()>0){
           this.name=name;
       }
   }
}
