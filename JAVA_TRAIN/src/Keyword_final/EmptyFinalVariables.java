package Keyword_final;
class Person {
    private final int age; // Biến cuối cùng trống

    public Person() {
        this.age = 0; // Khởi tạo biến age trong constructor
    }

    public int getAge() {
        return age;
    }
}
public class EmptyFinalVariables {
        public static void main(String[] args) {
            Person person = new Person();
            System.out.println("Age: " + person.getAge());
        }
}


