package Java8Features.Stream_In_Java.StreamCreation;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    static void main(String[] args) {
        /**
         * Creating a stream using Stream.of();
         */
        Stream<Integer> stream_pipeLine_ref_var;
        stream_pipeLine_ref_var=Stream.of(1,2,3,4,5,6);

        /**
         * Creating a Stream Using Static Method
         */
        String[] string_array = {"a","b","c","d","e","f"};
        Stream<String> stream_pipeLine_ref_var_2= Arrays.stream(string_array);

        /**
         * String character-->stream
         * "gautam" ---> "g" ->"a"->"u"->"t"->"a"->"m"
         */
         String nm=new String("Gautam Ducat Java Trainer");

         String[] splitedArr=nm.split(" ");

        Arrays.stream(splitedArr).forEach((string)->{
            System.out.println(string);
        });

        /**
         * Creating a iterative Stream
         */
        Stream<Integer> integerStream=Stream.iterate(1,i->i+1).limit(5);
        integerStream.forEach((integer)->{
            System.out.println(integer);
        });
    }
}
