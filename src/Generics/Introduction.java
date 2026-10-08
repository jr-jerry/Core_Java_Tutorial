package Generics;

public class Introduction {
    public static void main(String[] args) {
       printMethod(10,10);
    }
    public  static <T1,T2> void printMethod(T1 a,T2 b){
        System.out.println("a "+a+" b "+b);
    }//Remove add comment
}
