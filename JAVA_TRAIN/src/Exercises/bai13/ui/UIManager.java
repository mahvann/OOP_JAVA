package Exercises.bai13.ui;

import Exercises.bai13.entity.*;
import Exercises.bai13.exception.BirthdayException;
import Exercises.bai13.exception.EmailException;
import Exercises.bai13.exception.FullNameException;
import Exercises.bai13.exception.PhoneException;
import Exercises.bai13.service.EmployeeManager;
import Exercises.bai13.service.ValidatorService;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class UIManager {
    private EmployeeManager employeeManager =new EmployeeManager();
    public void checkData(Employee employee) throws BirthdayException, PhoneException, EmailException, FullNameException{
        ValidatorService.birthdayChek(employee.getBirthday());
        ValidatorService.phoneChek(employee.getPhone());
        ValidatorService.emailChek(employee.getEmail());
        ValidatorService.nameCheck(employee.getFullName());
    }
    private Employee createEmployee(Scanner scanner, int type){
        scanner.nextLine();
        System.out.print("Input ID: ");
        String id = scanner.nextLine();
        System.out.print("Input Name: ");
        String name = scanner.nextLine();
        System.out.println("Input birthday: ");
        LocalDate birthday = LocalDate.parse(scanner.nextLine());
        System.out.print("Input Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Input Email: ");
        String email = scanner.nextLine();
        List<Certificate> certificates = null;

        if (type == 0){
            System.out.println("Input experience in year: ");
            int expInYear =scanner.nextInt();
            scanner.nextLine();
            System.out.println("Input pro skill: ");
            String proSkill = scanner.nextLine();
            return new Experience(id,name,birthday,phone,email,certificates,expInYear,proSkill);
        }
        else if(type == 1){
            System.out.println("Input graduation date: ");
            LocalDate graduationDate = LocalDate.parse(scanner.nextLine());
            System.out.println("Input graduation rank: ");
            String graduationRank = scanner.nextLine();
            System.out.println("Input education: ");
            String education = scanner.nextLine();
            return new Fresher(id,name,birthday,phone,email,certificates,graduationDate,graduationRank,education);
        }else {
            System.out.println("Input majors: ");
            String majors = scanner.nextLine();
            System.out.println("Input semester: ");
            int semester = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Input university name: ");
            String universityName = scanner.nextLine();
            return new Intern(id,name,birthday,phone,email,certificates,majors,semester,universityName);
        }
    }
    private Experience insertExperience() {

        Scanner scanner = ScannerFactory.getScanner();
        return (Experience) createEmployee(scanner,0);
    }
    private Fresher insertFresher() {
        Scanner scanner = ScannerFactory.getScanner();
        return (Fresher) createEmployee(scanner,1);
    }
    private Intern insertIntern() {

        Scanner scanner = ScannerFactory.getScanner();
        return (Intern) createEmployee(scanner,2);
    }
    public void showAllEmployee() {
        this.employeeManager.findAll().forEach(Employee::showInformation);
    }

    public void insert(int type) {
        Employee employee = null;
        if (type == 0) {
            employee = insertExperience();
        }
        if (type == 1) {
            employee = insertFresher();
        }
        if (type == 2) {
            employee = insertIntern();
        }
        try {
            checkData(employee);
        } catch (BirthdayException e) {
            // insert  => insert(type);
            insert(type);
        } catch (PhoneException e) {
            // insert  => insert(type);
            insert(type);
        } catch (EmailException e) {
            // insert  => insert(type);
            insert(type);
        } catch (FullNameException e) {
            // insert  => insert(type);
            insert(type);
        }
        this.employeeManager.insert(employee);
    }
}
