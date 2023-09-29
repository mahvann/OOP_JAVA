package java8;

import java.util.Optional;

public class OptionalExample5 {
    public static void main(String[] args) {
        Integer year = 2023;
        Optional<Integer> yearOptional = Optional.ofNullable(year);
        boolean is2023 = yearOptional.filter(y -> y ==2023).isPresent();
        boolean is2022 = yearOptional.filter(y -> y == 2022).isPresent();
        System.out.println(is2023);
        System.out.println(is2022);
    }
}
