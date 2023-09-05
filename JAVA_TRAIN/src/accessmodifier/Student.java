package accessmodifier;

public class Student extends Person{
    private float gpa;
    Student(){

    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void chao(){
        System.out.println("Hello Student");
    }
    public String toString(){
        return name + " " + age + " " + gpa;
    }
    public static void main(String[] args) {
        Student p = new Student();

        p.name = "Manhvann";
        p.age = 18;
        p.setGpa(9.2f);
        p.chao();
        System.out.println( p);
        Person p1 = new Person() {
            @Override
            public void chao() {
                System.out.println("Hello Person");
            }

            @Override
            public String toString() {
                return name + " " + age;
            }
        };
        p1.name = "Toan";
        p1.age = 16;
        p1.chao();
        System.out.println(p1);
    }
}
