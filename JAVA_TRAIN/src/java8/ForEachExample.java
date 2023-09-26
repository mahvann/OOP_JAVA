package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
    public static void main(String[] args) {
        //Use Consumer interface
        Consumer<Integer> printConSumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer s) {
                System.out.println("Hello " + s);
            }
        };
        List<Integer> names = Arrays.asList(1,2, 3);
        names.forEach(printConSumer);

        //Collection forEach, use method reference object::instanceMethod
        names.forEach(System.out::println);
    }
}
