package java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesExample4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,4,0,5,3,6,2);

        numbers.forEach(x->{
            System.out.print(x + " ");
        });
        System.out.println();

        //lambda
        numbers.stream().sorted((a,b)-> a.compareTo(b)).toList().forEach(x->{
            System.out.print(x + " ");
        });
        System.out.println();

        //Reference to an instance method of an arbitrary object of a particular type – Class::instanceMethod
        numbers.stream().sorted(Integer::compareTo).toList().forEach(x->{
            System.out.print(x + " ");
        });

    }
}
