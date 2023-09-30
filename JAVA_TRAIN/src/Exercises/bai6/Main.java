package Exercises.bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();
        while(true){
            System.out.println("Student management application");
            System.out.println("1. Insert new Student");
            System.out.println("2. Show Student who age is 20");
            System.out.println("3.Count of Student who age is 23 and hometown is DN");
            System.out.println("4. To exit");
            String line = scanner.nextLine();
            switch (line){
                case "1":{
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter hometown: ");
                    String hometown = scanner.nextLine();
                    System.out.print("Enter Class: ");
                    int classStudent = scanner.nextInt();
                    scanner.nextLine();
                    school.addStudent(new Student(name,age,hometown,classStudent));
                    break;
                }
                case "2":{
                    school.showStudents20YearOld();
                    break;
                }
                case "3":{
                    System.out.println(school.countStudents23YearOldInDN());
                    break;
                }
                case "4":
                    return;
                default:
                    System.out.println("Invalid");
                    continue;

            }
        }
    }


}
