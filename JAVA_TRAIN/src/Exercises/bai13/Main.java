package Exercises.bai13;

import Exercises.bai13.entity.Employee;
import Exercises.bai13.entity.Experience;
import Exercises.bai13.entity.Fresher;
import Exercises.bai13.entity.Intern;
import Exercises.bai13.exception.BirthdayException;
import Exercises.bai13.exception.EmailException;
import Exercises.bai13.exception.FullNameException;
import Exercises.bai13.exception.PhoneException;
import Exercises.bai13.ui.ScannerFactory;
import Exercises.bai13.ui.UIManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BirthdayException, PhoneException, FullNameException, EmailException {
        UIManager uiManager = new UIManager();
        Scanner scanner = ScannerFactory.getScanner();

        while (true) {
            System.out.println("Application");
            System.out.println("Enter 1: To insert ");
            System.out.println("Enter 2: To search by id");
            System.out.println("Enter 3: To show list");
            System.out.println("Enter 4: To update employee by id");
            System.out.println("Enter 5: To delete employee by id");
            System.out.println("Enter 6: To search employees by position");
            System.out.println("Enter 7: To count employee by position");
            System.out.println("Enter 10: To exit");
            Integer line = scanner.nextInt();
            switch (line) {
                case 1: {
                    // input 0 => insert Experience
                    // input 1 => insert Fresher
                    // input 2 => insert Intern
                    System.out.println("Enter 0 to insert Experience");
                    System.out.println("Enter 1 to insert Fresher");
                    System.out.println("Enter 2 to insert Intern");
                    int type = scanner.nextInt();
                    uiManager.insert(type);
                    break;
                }
                case 2:{
                    System.out.println("Enter id you want to search");
                    scanner.nextLine();
                    String id = scanner.nextLine();
                    Employee employeeFindById = uiManager.getEmployeeManager().findById(id);
                    if (employeeFindById == null){
                        System.out.println("Employee Not found");
                    }
                    else{
                        employeeFindById.showInformation();
                    }
                    break;
                }
                case 3:{
                    uiManager.showAllEmployee();
                    break;
                }
                case 4:{
                    System.out.println("Enter id you want to update");
                    scanner.nextLine();
                    String id = scanner.nextLine();
                    Employee employeeFindById = uiManager.getEmployeeManager().findById(id);
                    if (employeeFindById == null){
                        System.out.println("Employee Not found");
                    }
                    else{
                        uiManager.updateEmployee(id);
                    }
                    break;

                }
                case 5:{
                    System.out.println("Enter id you want to delete");
                    scanner.nextLine();
                    String id = scanner.nextLine();
                    if(uiManager.getEmployeeManager().deleteById(id) ==false){
                        System.out.println("ID not found.");
                    }
                    break;
                }
                case 6:{
                    System.out.println("Enter 0 to search Experience");
                    System.out.println("Enter 1 to search Fresher");
                    System.out.println("Enter 2 to search Intern");
                    int type = scanner.nextInt();
                    switch (type){
                        case 0:{
                            uiManager.getEmployeeManager().getEmployees().stream().filter(x->x instanceof Experience).forEach(System.out::println);
                            break;
                        }
                        case 1:{
                            uiManager.getEmployeeManager().getEmployees().stream().filter(x->x instanceof Fresher).forEach(System.out::println);
                            break;
                        }
                        case 2:{
                            uiManager.getEmployeeManager().getEmployees().stream().filter(x->x instanceof Intern).forEach(System.out::println);
                            break;
                        }
                        default:{
                            System.out.println("Please try again");
                            continue;
                        }
                    }
                    break;
                }
                case 7:{
                    System.out.println("Enter 0 to count Experience");
                    System.out.println("Enter 1 to count Fresher");
                    System.out.println("Enter 2 to count Intern");
                    int type = scanner.nextInt();
                    switch (type){
                        case 0:{
                            System.out.println("Number of Experience: " + Experience.count);
                            break;
                        }
                        case 1:{
                            System.out.println("Number of Fresher: " + Fresher.count);
                            break;
                        }
                        case 2:{
                            System.out.println("Number of Intern: " + Intern.count);
                            break;
                        }
                        default:{
                            System.out.println("Please try again");
                            continue;
                        }
                    }
                    break;
                }
                case 10:
                    return;

            }
        }
    }
}
