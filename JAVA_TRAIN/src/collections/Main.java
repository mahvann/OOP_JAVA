package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>(); // Sử dụng ArrayList ban đầu

        // Thêm các phần tử vào ArrayList
        c.add("One");
        c.add("Two");

        // Sử dụng biến c và in ra các phần tử
        System.out.print("Elements in ArrayList: ");
        System.out.println(c);

        ArrayList cc = new ArrayList<>(c);
        String s = (String) cc.get(0);
        System.out.println(s);
        cc.set(0,"Manh");
        System.out.println("cc[0] after: " + cc.get(0));

        // Thay đổi triển khai cụ thể của Collection từ ArrayList thành HashSet
        c = new HashSet<>();

        // Thêm các phần tử vào HashSet
        c.add("Three");
        c.add("Four");

        // Sử dụng biến c và in ra các phần tử
        System.out.println("\nElements in HashSet:");
        for (String item : c) {
            System.out.println(item);
        }

        // Các phần còn lại của mã nguồn không bị ảnh hưởng
        System.out.println("\nThis is the rest of the code.");
    }
}
