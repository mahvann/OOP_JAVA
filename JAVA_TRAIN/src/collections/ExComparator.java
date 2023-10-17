package collections;

import java.util.*;

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class SortByNameAge implements Comparator<Student> {
    public int compare(Student a, Student b){
        if(a.getName().equals(b.getName()) == false) return a.getName().compareTo(b.getName());
        else{
            return a.getAge()-b.getAge();
        }
    }

}
public class ExComparator {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Manh3",23);
        Student student2 = new Student("Manh1",20);
        Student student3 = new Student("Manh2",20);
        Student student4 = new Student("Manh5",21);
        Student student5 = new Student("Manh7",20);
        Student student6 = new Student("Manh0",20);
        Student student7 = new Student("Manh2",17);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);

        Collections.sort(studentList,new SortByNameAge());
        studentList.forEach(System.out::println);
    }
}
