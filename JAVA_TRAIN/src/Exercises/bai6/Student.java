package Exercises.bai6;

public class Student {
    private String name;
    private int age;
    private String hometown;
    private int classSTudent;

    public Student() {
    }

    public Student(String name, int age, String hometown, int classSTudent) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.classSTudent = classSTudent;
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

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public int getClassSTudent() {
        return classSTudent;
    }

    public void setClassSTudent(int classSTudent) {
        this.classSTudent = classSTudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hometown='" + hometown + '\'' +
                ", classSTudent=" + classSTudent +
                '}';
    }
}
