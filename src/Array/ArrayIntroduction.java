package Array;

import java.util.Scanner;

public class ArrayIntroduction {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of row you want ");
        int row=sc.nextInt();
        System.out.println("Enter size of column you want ");
        int col=sc.nextInt();

        int[][] Arr=new int[row][col];

       for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               System.out.println("Enter value for row "+i+" col: "+j);
                Arr[i][j]=sc.nextInt();
           }
       }
        for(int r=0;r<row;r++){
            for(int c = 0; c <col; c++){
                if(r==c)
                System.out.print(Arr[r][c]+", ");
            }
            System.out.println();
        }
    }
}
