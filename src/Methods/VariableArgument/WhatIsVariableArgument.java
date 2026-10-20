package Methods.VariableArgument;

import java.util.Scanner;

public class WhatIsVariableArgument {
    public static int sum(int a,int b){
        return a+b;
    }


    static void main() {
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        int input4=sc.nextInt();
       int[] arr=new int[4];
       arr[0]=input1;
       arr[1]=input2;
       arr[2]=input3;
       arr[3]=input4;

       arr[0]=111;
        for(int i=0;i<arr.length;i++)
         System.out.println(arr[i]);
    }
}
