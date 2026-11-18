package CollectionFramework.Iterator;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        List<Integer> numberList=new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);

        //Using traditional for Loop
        System.out.println("Using traditional for loop");
        for(int i=0;i<numberList.size();i++){
            System.out.println(numberList.get(i));
        }
        //Using for-each Loop
        System.out.println("Using for each loop");
        for(Integer element:numberList){
            System.out.println(element);
        }
        //Using Iterator
        System.out.println("Using Iterator");
        Iterator<Integer> it;

        it=numberList.iterator();

        while(it.hasNext()){
            Integer data=it.next();
            System.out.println(data);
        }

    }
}
