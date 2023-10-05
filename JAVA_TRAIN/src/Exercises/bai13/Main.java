package Exercises.bai13;

import Exercises.bai13.ui.ScannerFactory;
import Exercises.bai13.ui.UIManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UIManager uiManager = new UIManager();
        Scanner scanner = ScannerFactory.getScanner();

        while (true) {
            System.out.println("Application");
            System.out.println("Enter 1: To insert ");
            System.out.println("Enter 2: To search ");
            System.out.println("Enter 3: To show list");
            System.out.println("Enter 4: To exit");
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
                case 3:{
                    uiManager.showAllEmployee();
                    break;
                }
                case 4:
                    return;

            }
        }
    }
}
