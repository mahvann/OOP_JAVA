package collections;

import java.util.ArrayList;
import java.util.ListIterator;
public class ExListIterator {

        public static void main(String[] args) {
            ArrayList<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");

            ListIterator<String> listIterator = names.listIterator();
            while (listIterator.hasNext()) {
                String name = listIterator.next();
                System.out.println(name);
            }

            // Di chuyển ngược lại
            while (listIterator.hasPrevious()) {
                String name = listIterator.previous();
                System.out.println(name);
            }

            System.out.println("--------------");
            for (String name: names){
                System.out.println(name);
            }
        }

}
