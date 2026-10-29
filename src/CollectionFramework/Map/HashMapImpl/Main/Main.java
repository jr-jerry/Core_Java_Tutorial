package CollectionFramework.Map.HashMapImpl.Main;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        Map<Character,String> map=new HashMap<>();
        map.put('a', "a");
        map.put('e',"a");
        map.put(null,"Null key value");
        map.put(null,"New Null key value 2");
        map.put('a',"new string");
        map.put('b', "b");
        map.put('c', "c");

        System.out.println(map);
    }
}
