package Java8Features.Stream_In_Java.FeatureOfStream.StoreStreamData;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        List<String> streamList=list.stream().map((string)->{
            return string.toUpperCase();
        }).toList();

        System.out.println(list);
        System.out.println(streamList);
    }
}
