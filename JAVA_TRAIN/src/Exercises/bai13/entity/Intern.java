package Exercises.bai13.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

public class Intern extends Employee{
    public static long count = 0;
    private String majors;
    private int semester;
    private String universityName;

    public Intern() {
        count++;
    }



    public Intern(String majors, int semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
        count++;
    }

    public Intern(String id, String fullName, LocalDate birthday, String phone, String email, Set<Certificate> certificates, String majors, int semester, String universityName) {
        super(id, fullName, birthday, phone, email, certificates);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
        count++;
    }

    @Override
    public void showInformation() {
        System.out.println(this);
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Intern{" +
                "majors='" + majors + '\'' +
                ", semester=" + semester +
                ", universityName='" + universityName + '\'' +
                ", id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + dateTimeFormatter.format(birthday) +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", certificates=" + certificates +
                '}';
    }
}
