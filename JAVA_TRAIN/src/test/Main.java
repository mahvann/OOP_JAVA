package test;
class PerSon{
    public void talk(){
        System.out.println("Person is talking");
    }
}
class Employee extends PerSon{
    public void salary(){
        System.out.println("Salary 1000$");
    }
    public void talk(){
        System.out.println("Employee is talking");
    }

}
public class Main {
    public static void main(String[] args) {
        PerSon p = new Employee();
        Employee e ;
         e = (Employee)p;
        e.salary();
    }
}
