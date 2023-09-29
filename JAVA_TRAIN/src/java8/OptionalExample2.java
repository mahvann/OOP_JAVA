package java8;

import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {

        Optional<String> optional = Optional.of("NguyenVanManh");
        optional.ifPresent(s -> System.out.println(s.length()));

        //if the string is null then the code inside will not be executed.
        Optional<String> optional1 = Optional.empty();
        optional1.ifPresent(s -> System.out.println(s.length()));

        //Use normally String
        String s =null;
        System.out.println(s.length());

    }
}
