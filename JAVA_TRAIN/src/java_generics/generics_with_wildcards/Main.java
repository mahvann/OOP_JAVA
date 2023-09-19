package java_generics.generics_with_wildcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class WildcardExample<T>{
    public void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public void printNumbers(List<? extends Number> numbers) {


        //Collections.sort(numbers, Comparator.reverseOrder());
        for (Number num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void sortStrings(List<? super String> strings) {
         // Sắp xếp theo thứ tự ngược lại
        System.out.println(strings);
    }


//    public void printNumbers(List<T> numbers,Comparator< T> comparator) {
//        Collections.sort(numbers,comparator);
//        for (Object num : numbers) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
}




public class Main {
    public static void main(String[] args) {
        WildcardExample example = new WildcardExample();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        example.printList(integerList);



        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.4);
        doubleList.add(1.2);
        doubleList.add(1.3);
        example.printNumbers(doubleList);

        List<String> stringList = new ArrayList<>();
        stringList.add("aa");
        stringList.add("bb");
        stringList.add("cc");
        example.sortStrings(stringList);
    }
}
