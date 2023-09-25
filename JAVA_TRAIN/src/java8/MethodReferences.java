package java8;

import java.util.HashMap;
import java.util.Map;

public class MethodReferences {
    public static void main(String[] args) {
        Map<String,Integer> nameMap = new HashMap<>();

        Integer value = nameMap.computeIfAbsent("John", String::length);
        System.out.println(value);
    }
}
