package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class PractiseLowerBound {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        System.out.println(list.containsAll(Arrays.asList( 6,2, 7, 8,10,9)));
    }
}
//class Box_1<?>{}
