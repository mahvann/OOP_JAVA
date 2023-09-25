package IO;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return name + " " + age + "\n";
    }
}
public class Test {
    public static void main(String[] args) throws IOException {
        List<Employee> listEmployee = new ArrayList<>();
        Employee e1 = new Employee("Manh1",20);
        Employee e2 = new Employee("Manh2",20);
        Employee e3 = new Employee("Manh3",20);
        listEmployee.add(e1);
        listEmployee.add(e2);
        listEmployee.add(e3);
        FileOutputStream fout = null;
        FileWriter fileWriter = null;
        try{
            fout = new FileOutputStream("D:\\testIO.txt");
            fileWriter = new FileWriter("D:\\testIOWriter.txt");
            for (Employee e : listEmployee){
                byte [] b = e.toString().getBytes();
                //fout.write(b);
                //fout.write;
                fileWriter.write(e.toString());
            }
            System.out.println("Success");
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            fout.close();
            fileWriter.close();
        }

        FileReader fileReader = null;
        try {
            fileReader = new FileReader("D:\\testIOWriter.txt");
            int ch;
            while(( ch= fileReader.read())!=-1){
                System.out.print((char)ch);
            }


        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            fileReader.close();
        }
    }
}
