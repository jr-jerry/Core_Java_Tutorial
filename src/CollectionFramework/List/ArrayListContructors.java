package CollectionFramework.List;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListContructors {
    static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        new ArrayList<>();
        List<Number> list=new ArrayList<Number>(4);

        list.add(1);//0-index
        list.add(2);//1-index

        System.out.println("List size "+list.size());
        list.add(2,10);
        list.add(3,20);
        list.add(4,30);
        list.add(5,40);
        list.add(6,50);

        System.out.println(list);
        Field field=ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);

        Object[] objects=(Object[])field.get(list);
        System.out.println("Internal array Length "+objects.length);;

    }
}
