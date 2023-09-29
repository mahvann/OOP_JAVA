package java8;

import java.io.IOException;
import java.util.Optional;

public class OptionalExample4 {
    public static void main(String[] args) {
        try {
            String nullName = null;
            //Use orElseThrow() throw an exception if object is null
            String name = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
            System.out.println(name);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
