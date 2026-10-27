package CollectionFramework.List.Set.HashSetImpl;

import java.util.HashMap;
import java.util.HashSet;

import java.util.Set;

public class Main {
    static void main(String[] args) {
        Set<Integer> numberSet=new HashSet<>();
        System.out.println("numberSet.add(3)"+numberSet.add(3));
        System.out.println("numberSet.add(2)"+numberSet.add(2));
        System.out.println("numberSet.add(3)"+numberSet.add(3));
        System.out.println("numberSet.add(0)"+numberSet.add(0));
        System.out.println("numberSet.add(null)"+numberSet.add(null));
        System.out.println("numberSet.add(null)"+numberSet.add(null));

        HashMap<Integer,String> map=new HashMap<>();
        System.out.println("map.put(3,PRESENT)"+map.put(3,"PRESENT"));
        System.out.println("map.put(3,ABSENT)"+map.put(3,"ABSENT"));

        System.out.println(numberSet);
    }
}
