package Exercises.bai3;

import java.util.Scanner;

public class Main {
    public static Candidate createCadidate(Scanner sc, String cate) {
        System.out.print("Enter identificationNumber: ");
        int iD = sc.nextInt();
        System.out.print("Enter name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.print("Enter priority: ");
        int priority = sc.nextInt();
        sc.nextLine();
        if (cate.equals("a")) {
            return new CandidateA(iD, name, address, priority);
        } else if (cate.equals("b")) {
            return new CandidateB(iD, name, address, priority);
        } else {
            return new CandidateC(iD, name, address, priority);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admisstion admisstion = new Admisstion();
        while (true) {
            System.out.println("Application Manager Candidate");
            System.out.println("Enter 1: To insert candidate");
            System.out.println("Enter 2: To show information of candidate");
            System.out.println("Enter 3: To search candidate by ID");
            System.out.println("Enter 4: To exit");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert Candidate A");
                    System.out.println("Enter b: to insert Candidate B");
                    System.out.println("Enter c: to insert Candidate C");
                    String type = sc.nextLine();
                    switch (type) {
                        case "a": {
                            admisstion.add(createCadidate(sc, "a"));
                            break;

                        }
                        case "b": {
                            admisstion.add(createCadidate(sc, "b"));
                            break;
                        }
                        case "c": {
                            admisstion.add(createCadidate(sc, "c"));
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    admisstion.showInfor();
                    break;
                }
                case "3": {
                    System.out.println("Enter ID:");
                    int iD = sc.nextInt();
                    sc.nextLine();
                    Candidate candidate = admisstion.searchById(iD);
                    if (candidate == null) {
                        System.out.println("Not found");
                    } else {
                        System.out.println(candidate.toString());
                    }
                    break;
                }
                case "4":{
                    return;
                }

            }
        }
    }
}
