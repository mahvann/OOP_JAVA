package Exercises.bai13.ui;

import java.util.Scanner;

public class ScannerFactory {
    private static Scanner SCANNER;
    public static Scanner getSCANNER(){
        if (SCANNER == null){
            SCANNER =new Scanner(System.in);
        }
        return SCANNER;
    }
}
