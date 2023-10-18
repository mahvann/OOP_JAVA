package Exercises.bai13.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

public class Experience extends Employee{
    public static long count = 0;
    private int expInYear;
    private String proSkill;

    public Experience() {
        count++;
    }

    public Experience(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
        count++;
    }

    public Experience(String id, String fullName, LocalDate birthday, String phone, String email, Set<Certificate> certificates, int expInYear, String proSkill) {
        super(id, fullName, birthday, phone, email, certificates);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
        count++;
    }

    @Override
    public void showInformation() {
        System.out.println(this);
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Experience{" +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                ", id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + dateTimeFormatter.format(birthday) +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", certificates=" + certificates +
                '}';
    }
}
