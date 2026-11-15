package CollectionFramework.SET;

import java.util.*;

public class LinkedHashSEt {
    static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        System.out.println("map.put(a1,a)"+map.put("a1","a"));
        System.out.println("map.put(a1,b)"+map.put("a1","b"));
        System.out.println("map.put(a1,c)"+map.put("a1","c"));

        System.out.println(map);

        map.remove("a1");
        System.out.println(map);


        Set set = new HashSet();
        Box box1Ref=new Box(10);
        set.add(box1Ref);
        set.add(null);
        System.out.println("set before remove "+set);
        set.remove(box1Ref);
        System.out.println("set after remove "+set);

    }
}
class Box{
    @Override
    public String toString() {
        return "Box{" +
                "data=" + data +
                '}';
    }
    private int data;
    public Box(int data) {
        this.data = data;
    }
}
