package Java8Features.Stream_In_Java.FeatureOfStream.StreamTransformMation;

import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> list=List.of("gautam","yulia","amit","shubham","aryan");

        List<Integer> lengthList=list.stream().map(
                (string)->{
                    return string.length();
                }
        ).toList();

        System.out.println(lengthList);
    }
}
