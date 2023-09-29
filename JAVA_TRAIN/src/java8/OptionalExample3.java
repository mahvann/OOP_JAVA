package java8;

import java.util.Optional;

public class OptionalExample3 {
    public static String getMyDefault(){
        System.out.println("Getting Default Value");
        return  "Default Value";
    }

    public static void main(String[] args) {
        String text = "not null";
        //orElseGet() only works when text = null
        String defaultText = Optional.ofNullable(text).orElseGet(OptionalExample3::getMyDefault);
        System.out.println(defaultText);

        System.out.println();
        //orElse always works even through text = null or not null
        defaultText = Optional.ofNullable(text).orElse(getMyDefault());
        System.out.println(defaultText);
    }
}
