package class_object.hashcode;
class Student {
    private String studentId;
    private String name;

    // ... (Constructor và các phương thức khác)

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int result = studentId != null ? studentId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("S123", "John");
        Student student2 = new Student("S123", "John");

        int hashCode1 = student1.hashCode();
        int hashCode2 = student2.hashCode();

        System.out.println("Hash code của student1: " + hashCode1);
        System.out.println("Hash code của student2: " + hashCode2);
    }
}
