package Exercises.bai6;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
    public void showStudents(){
        this.students.forEach(student -> System.out.println(student.toString()));
    }
    public void showStudents20YearOld(){
        this.students.forEach(student -> {if (student.getAge()==20) System.out.println(student.toString());});
    }
    public long countStudents23YearOldInDN(){
        return this.students.stream().filter(student -> student.getAge()==23 &&student.getHometown().equals("DN")).count();
    }
}
