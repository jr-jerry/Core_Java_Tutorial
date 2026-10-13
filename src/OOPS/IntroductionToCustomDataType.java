package OOPS;

import java.util.Scanner;

public class IntroductionToCustomDataType {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter first profile name ");
        String name1=sc.nextLine();
        String profiletype1=sc.nextLine();
        Profile profile1=new Profile();
        profile1.name=name1;
        profile1.profileType=profiletype1;

        System.out.println("Enter second profile name ");
          name1=sc.nextLine();
            profiletype1=sc.nextLine();

            Profile profile2=new Profile();
            profile2.name=name1;
            profile2.profileType=profiletype1;



        System.out.println("Enter second profile name ");
    }
}

class Box{
    int value;
}
class Profile{
    String name;
    String profileType;
}