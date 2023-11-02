package Exercises.bai15.service;

import Exercises.bai15.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> studentList;

    public StudentManager(List<Student> studentList) {
        studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    public void insert(Student student){
        studentList.add(student);
    }
    public Student findById(String id){
        return studentList.stream().filter(student->student.getId().equals(id)).findFirst().orElse(null);
    }
    public void deleteStudentById(String id){

    }
}
