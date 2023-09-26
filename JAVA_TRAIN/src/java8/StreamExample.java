package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //Createing a Empty Stream
        Stream<String> streamEmpty = Stream.empty();


        //Stream of Collection
        Collection<String> collection = Arrays.asList("a","b","c");
        Stream<String> streamOfCollection = collection.stream();


        //Stream of Array
        Stream<String> streamOfArray = Stream.of("e","f","g");

        String [] arr = new String[]{"m","n","p"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);


    }
}
