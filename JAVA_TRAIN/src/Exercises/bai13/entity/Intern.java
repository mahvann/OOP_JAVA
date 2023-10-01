package Exercises.bai13.entity;

import java.time.LocalDate;
import java.util.List;

public class Intern extends Employee{
    private String majors;
    private int semester;
    private String universityName;

    public Intern() {
    }



    public Intern(String majors, int semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(String id, String fullName, LocalDate birthday, String phone, String email, List<Certificate> certificates, String majors, int semester, String universityName) {
        super(id, fullName, birthday, phone, email, certificates);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
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
        return "Intern{" +
                "majors='" + majors + '\'' +
                ", semester=" + semester +
                ", universityName='" + universityName + '\'' +
                ", id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", certificates=" + certificates +
                '}';
    }
}
