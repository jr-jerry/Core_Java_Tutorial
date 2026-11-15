package CollectionFramework.Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>(32, .5f);
        map.put("gautam", 1);
        map.put("shubham",1);
        map.put("C", 2);
        map.put("D", 3);
        System.out.println(map);
    }
}
