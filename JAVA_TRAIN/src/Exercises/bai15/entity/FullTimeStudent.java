package Exercises.bai15.entity;

import java.time.LocalDate;
import java.util.List;

public class FullTimeStudent extends Student{
    public FullTimeStudent() {
    }

    public FullTimeStudent(String id, String name, LocalDate birthday, int yearOfAdmission, double entryExamScore, Department department, List<AcademicRecord> academicRecords) {
        super(id, name, birthday, yearOfAdmission, entryExamScore, department, academicRecords);
    }

    @Override
    public String toString() {
        return "FullTimeStudent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", yearOfAdmission=" + yearOfAdmission +
                ", entryExamScore=" + entryExamScore +
                ", department=" + department +
                ", academicRecords=" + academicRecords +
                '}';
    }
}
