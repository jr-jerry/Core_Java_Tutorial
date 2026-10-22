package Array;

import java.util.Scanner;

public class ArrayIntroduction {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter three value ");
        int[] array=new int[3];
        array[0]=sc.nextInt();
        array[1]=sc.nextInt();
        array[2]=sc.nextInt();

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
