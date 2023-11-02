package Exercises.bai15.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Student {
    protected String id;
    protected String name;
    protected LocalDate birthday;
    protected int yearOfAdmission;

    protected double entryExamScore;
    protected Department department;

    protected List<AcademicRecord> academicRecords;

    public Student() {
    }

    public Student(String id, String name, LocalDate birthday, int yearOfAdmission, double entryExamScore, Department department, List<AcademicRecord> academicRecords) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.yearOfAdmission = yearOfAdmission;
        this.entryExamScore = entryExamScore;
        this.department = department;
        this.academicRecords = academicRecords;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public double getEntryExamScore() {
        return entryExamScore;
    }

    public void setEntryExamScore(double entryExamScore) {
        this.entryExamScore = entryExamScore;
    }

    public List<AcademicRecord> getAcademicRecords() {
        return academicRecords;
    }

    public void setAcademicRecords(List<AcademicRecord> academicRecords) {
        this.academicRecords = academicRecords;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
