package Exeption;

import java.util.Scanner;

public class ExceptionExampleThrow {
    public static void main(String[] args) {
        int age;
        System.out.println("Entry the age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age<18){
            throw new ArithmeticException("Age is invalid");
        }else{
            System.out.println("Welcom");
        }
    }
}
