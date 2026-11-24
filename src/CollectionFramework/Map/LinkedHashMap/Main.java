package CollectionFramework.Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    static void main(String[] args) {
       Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(4,"four");
        treeMap.put(3,"three");
        treeMap.put(2,"two");
        treeMap.put(1,"one");

        System.out.println(treeMap);
    }
}
