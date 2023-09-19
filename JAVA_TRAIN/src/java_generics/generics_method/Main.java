package java_generics.generics_method;

import java.util.ArrayList;
import java.util.List;

class GenericsTest{
    public <T> int count(List<T> list, T itemToCount){
        int count = 0;
        for (T item : list){
            if (itemToCount.equals(item)){
                count++;
            }
        }
        return count;
    }
    public <T extends Number,U extends Number> int count2(List<T> list, U obj){
        int count = 0;
        for (T item : list){
            if(item.doubleValue() - obj.intValue() == 0){
                count++;
            }
        }
        return count;
    }
    public <T> int count3(List<T> list, T itemToCount){
        T []arr = (T[]) new Object[list.size()];
        for (int i = 0; i<list.size();i++){
            arr[i] = list.get(i);
        }
        int count = 0;
        for (T item : arr){
            if (itemToCount.equals(item)){
                count++;
            }
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        list.add("B");
        list.add("A");
        System.out.println(new GenericsTest().count(list,"A"));

        List<Double> list2 = new ArrayList<>();
        list2.add(1.0);
        list2.add(1.1);
        list2.add(1.2);
        System.out.println(new GenericsTest().count2(list2,1));
    }
}
