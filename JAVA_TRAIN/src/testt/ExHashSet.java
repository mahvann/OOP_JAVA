package testt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

class Person{
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
public class ExHashSet {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();
        Person person1 = new Person(1,"Nguyen Van Manh",18);
        Person person2 = new Person(1,"Nguyen Van Manh",19);



        personSet.add(person1);
        personSet.add(person2);
        personSet.forEach(System.out::println);
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());


//        HashMap<Person, Integer> personIntegerHashMap = new HashMap<>();
//        personIntegerHashMap.put(person1,111);
//        personIntegerHashMap.put(person2,222);
//        for(Entry<Person, Integer> entry : personIntegerHashMap.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//        Person person3 = new Person(1,"Nguyen Van Manh",18);
//        Person person4 = new Person(4,"Nguyen Van Manh",18);
//        System.out.println(personIntegerHashMap.get(person3));
    }
}
