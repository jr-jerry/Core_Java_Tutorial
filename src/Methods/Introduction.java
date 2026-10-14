package Methods;

import java.util.Scanner;

public class Introduction {
    static void main(String[] args) {
        int res1=m1();
        float res2=m2();
        char res3=m3();
        String res4=m4();
        System.out.println("m1: "+res1+" m2: "+res2+" m3: "+res3+" m4: "+res4);

    }
    public void method(){
        System.out.println("Instance method called ");
    }
    public static int m1(){
        return 5;
    }
    public static float m2(){
        return 6.5f;
    }
    public static char m3(){
        return 'Y';
    }
    public static String m4(){
        return "ducat";
    }

}