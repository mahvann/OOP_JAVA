package Exercises.bai13.entity;

import Exercises.bai13.exception.BirthdayException;
import Exercises.bai13.service.ValidatorService;
import Exercises.bai13.ui.ScannerFactory;
import Exercises.bai13.ui.UIManager;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Certificate {
    Scanner scanner = ScannerFactory.getScanner();
    private String id;
    private String name;
    private String rank;
    private LocalDate date;

    public Certificate() {
    }

    public Certificate(String id, String name, String rank, LocalDate date) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.date = date;
    }

    public void input(){
        System.out.println("Enter id Certificate");
        id = scanner.nextLine();
        System.out.println("Enter name Certificate");
        name = scanner.nextLine();
        System.out.println("Enter rank Certificate");
        rank = scanner.nextLine();

        String dateString;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        while (true) {
            System.out.println("Input date Certificate(dd-MM-yyyy): ");
            dateString = scanner.nextLine();
            dateString = dateString.trim();
            if (UIManager.containsLetterRegex(dateString) || !UIManager.containsBirthdayRegex(dateString)) {
                System.out.println("Date is invalid. Entry please!!");
            } else {
                try {
                    date = LocalDate.parse(dateString, dateTimeFormatter);
                    ValidatorService.birthdayCheck(date);
                    break;
                } catch (BirthdayException e) {
                    System.out.println(e.getMessage());
                }
            }

        }
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", date=" + date +
                '}';
    }
}
