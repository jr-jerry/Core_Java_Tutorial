package Java8Features.Stream_In_Java;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Stream<Integer> streamOfInteger=list.stream();
        streamOfInteger.forEach((data)-> System.out.println(data));

        System.out.println(list.stream().filter(data->data%2==0).toList());
    }
}
