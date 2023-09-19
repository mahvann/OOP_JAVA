package java_generics.generics_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        Set<String> keySet = map.keySet();
        System.out.println(keySet); // In ra: [banana, cherry, apple]

    }
}
