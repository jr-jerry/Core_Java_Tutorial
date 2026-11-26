package Java8Features.Stream_In_Java.FeatureOfStream.StreamData_Filteration;

import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> filterdList=list.stream().filter(
                (number)->number%2!=0
        ).toList();

        System.out.println(filterdList);

        List<String> nameList=List.of("Gautam","AMit","Shubham","Rohit","Kamal");

        List<String> fitlerdList;

    }
}
