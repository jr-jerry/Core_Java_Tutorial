package String_Class;

public class StringBuilder_Introduction {
    static void main(String[] args) {
        String name="Aman";
         StringBuilder builder=new StringBuilder("Aman");
         builder.append("Tyagi");
         builder.append("Ducat Associate");

         String newStrin=builder.toString();

        System.out.println(newStrin);

    }
}
