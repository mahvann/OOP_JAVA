package Exercises.bai1;

import java.util.Scanner;

public class Main {
    public static Officer createOfficer(Scanner scanner, String type){
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age:");
        int age = scanner.nextInt();
        System.out.print("Enter gender: ");
        scanner.nextLine();
        String gender = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        if(type.equals("a")){
            System.out.print("Enter branch: ");
            String branch = scanner.nextLine();
            return new Engineer(name, age, gender, address, branch);
        }
        else if(type.equals("b")){
            System.out.print("Enter level: ");
            int level = scanner.nextInt();
            scanner.nextLine();
            return new Worker(name, age, gender, address, level);
        }
        else{
            System.out.print("Enter task: ");
            String task = scanner.nextLine();
            return new Staff(name, age, gender, address, task);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageOfficer manageOfficer = new ManageOfficer();
        while (true) {
            System.out.println("Application Manager Officer");
            System.out.println("Enter 1: To insert officer");
            System.out.println("Enter 2: To search officer by name: ");
            System.out.println("Enter 3: To show information officers");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert Enginner");
                    System.out.println("Enter b: to insert Worker");
                    System.out.println("Enter c: to insert Staff");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {

                            manageOfficer.addOfficer(createOfficer(scanner,"a"));
                            break;

                        }
                        case "b": {
                            manageOfficer.addOfficer(createOfficer(scanner,"b"));
                            break;
                        }
                        case "c": {
                            manageOfficer.addOfficer(createOfficer(scanner,"c"));
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    manageOfficer.searchOfficerByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;
                }
                case "3": {
                    manageOfficer.showListOfficer();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }
    }
}
