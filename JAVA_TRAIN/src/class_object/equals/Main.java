package class_object.equals;
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Nếu là cùng một đối tượng
        if (obj == null || getClass() != obj.getClass()) return false; // Nếu obj không phải là đối tượng của lớp Person

        //Person person = (Person) obj; // Ép kiểu obj thành Person

        // So sánh nội dung của các thuộc tính
        if (age != ((Person)obj).age) return false;
        return name != null ? name.equals(((Person) obj ).name) : ((Person) obj).name == null;
    }


}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);

        boolean areEqual = person1.equals(person2);
        System.out.println("Có phải là hai đối tượng Person bằng nhau không? " + areEqual);
    }
}
