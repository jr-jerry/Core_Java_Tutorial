package CollectionFramework.Map.HashMapImpl.Main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.remove("A");
        for (String key : map.keySet()) {
            if (key.equals("B")) {
                System.out.println("B found");
            }
        }

        System.out.println(map);
//         map.entrySet()
    }

}
