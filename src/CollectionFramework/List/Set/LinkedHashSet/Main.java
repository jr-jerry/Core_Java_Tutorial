package CollectionFramework.List.Set.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    static void main(String[] args) {
        Set<Integer> hashSet=new HashSet<Integer>();
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(null);
        hashSet.add(4);

        Set<Integer> set=new LinkedHashSet<>();
        set.add(1);
        set.add(null);

        set.add(2);
        set.add(3);

        set.add(4);
        set.add(5);

        System.out.println("Linked HashSet "+set+" HashSet "+hashSet);
    }
}
