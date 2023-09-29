package java8;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        //Creating Optional Objects

        //we can use the empty() method
        Optional<String> empty = Optional.empty();

        //We can also use the of() method
        Optional<String> optional = Optional.of("input.net");
        boolean isPresent = optional.isPresent();
        System.out.println(optional);
        System.out.println(isPresent);

        //We can also use the ofNullable() method
        String name = null;
        Optional<String> optional1 = Optional.ofNullable(name);
        System.out.println(optional1.isPresent());
    }
}
