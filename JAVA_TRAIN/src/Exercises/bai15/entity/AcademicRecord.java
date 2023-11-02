package Exercises.bai15.entity;

public class AcademicRecord {
    private String semester;
    private double averageGrade;

    public AcademicRecord() {
    }

    public AcademicRecord(String semester, double averageGrade) {
        this.semester = semester;
        this.averageGrade = averageGrade;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
