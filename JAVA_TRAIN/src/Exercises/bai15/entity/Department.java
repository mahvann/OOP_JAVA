package Exercises.bai15.entity;

import java.util.List;
import java.util.Set;

public class Department {
    private String departmentName;
    private Set<Student> students;

    public Department() {
    }

    public Department(String departmentName, Set<Student> students) {
        this.departmentName = departmentName;
        this.students = students;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                '}';
    }
}
