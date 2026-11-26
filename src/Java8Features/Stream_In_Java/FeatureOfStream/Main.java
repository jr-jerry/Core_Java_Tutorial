package Java8Features.Stream_In_Java.FeatureOfStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        list.stream().map((string)->{
            return string.toUpperCase();
        }).forEach(string-> System.out.println(string));

        System.out.println(list);
    }
}
