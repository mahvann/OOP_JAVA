package Exercises.bai13.ui;

import Exercises.bai13.entity.*;
import Exercises.bai13.exception.BirthdayException;
import Exercises.bai13.exception.EmailException;
import Exercises.bai13.exception.FullNameException;
import Exercises.bai13.exception.PhoneException;
import Exercises.bai13.service.EmployeeManager;
import Exercises.bai13.service.ValidatorService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class UIManager {
    private EmployeeManager employeeManager = new EmployeeManager();

    public EmployeeManager getEmployeeManager() {
        return employeeManager;
    }

    public void setEmployeeManager(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    private Employee createEmployee(Scanner scanner, int type) {
        scanner.nextLine();
        System.out.print("Input ID: ");
        String id = scanner.nextLine();
        while (employeeManager.findById(id) != null) {
            System.out.print("Input ID again: ");
            id = scanner.nextLine();
        }

        String fullName;
        while (true) {
            try {
                System.out.print("Input full name: ");
                fullName = scanner.nextLine();
                fullName = Arrays.stream(fullName.trim().replaceAll("\\s+", " ").split(" "))
                        .map(w -> w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase())
                        .collect(Collectors.joining(" "));
                ValidatorService.nameCheck(fullName);
                System.out.println(fullName);
                break;
            } catch (FullNameException e) {
                System.out.println(e.getMessage());
            }
        }

        LocalDate birthday = null;
        String birthdayString;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        while (true) {
            System.out.println("Input birthday(dd-MM-yyyy): ");
            birthdayString = scanner.nextLine();
            birthdayString = birthdayString.trim();
            if (containsLetterRegex(birthdayString) || !containsBirthdayRegex(birthdayString)) {
                System.out.println("Date is invalid. Entry please!!");
            } else {
                try {
                    birthday = LocalDate.parse(birthdayString, dateTimeFormatter);
                    ValidatorService.birthdayCheck(birthday);
                    break;
                } catch (BirthdayException e) {
                    System.out.println(e.getMessage());
                }
            }

        }


        String phone;
        while (true) {
            try {
                System.out.print("Input Phone: ");
                phone = scanner.nextLine();
                ValidatorService.phoneCheck(phone);
                break;
            } catch (PhoneException e) {
                System.out.println(e.getMessage());
            }
        }

        String email;
        while (true) {
            try {
                System.out.print("Input Email: ");
                email = scanner.nextLine();
                ValidatorService.emailCheck(email);
                break;
            } catch (EmailException e) {
                System.out.println(e.getMessage());
            }
        }

        List<Certificate> certificates = new ArrayList<>();
        int n;
        System.out.println("Enter number of Certificate: ");
        n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0;i<n;i++){
            System.out.println("Enter Certificate" + (i+1));
            Certificate certificate = new Certificate();
            certificate.input();
            certificates.add(certificate);
        }


        if (type == 0) {
            System.out.println("Input experience in year: ");
            int expInYear = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Input pro skill: ");
            String proSkill = scanner.nextLine();
            return new Experience(id, fullName, birthday, phone, email, certificates, expInYear, proSkill);
        } else if (type == 1) {
            LocalDate graduationDate = null;
            String graduationDateString;
            while (true) {
                System.out.println("Input graduation date(dd-MM-yyyy): ");
                graduationDateString = scanner.nextLine().trim();
                if (containsLetterRegex(graduationDateString) || !containsBirthdayRegex(graduationDateString)) {
                    System.out.println("Graduation date is invalid. Entry please!!");
                } else {
                    try {
                        graduationDate = LocalDate.parse(graduationDateString, dateTimeFormatter);
                        ValidatorService.birthdayCheck(graduationDate);
                        break;
                    } catch (BirthdayException e) {
                        System.out.println(e.getMessage());
                    }
                }

            }

            System.out.println("Input graduation rank: ");
            String graduationRank = scanner.nextLine();
            System.out.println("Input education: ");
            String education = scanner.nextLine();
            return new Fresher(id, fullName, birthday, phone, email, certificates, graduationDate, graduationRank, education);
        } else {
            System.out.println("Input majors: ");
            String majors = scanner.nextLine();
            System.out.println("Input semester: ");
            int semester = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Input university name: ");
            String universityName = scanner.nextLine();
            return new Intern(id, fullName, birthday, phone, email, certificates, majors, semester, universityName);
        }
    }

    private Experience insertExperience() {

        Scanner scanner = ScannerFactory.getScanner();
        Experience experience = (Experience) createEmployee(scanner, 0);
        return experience;
    }

    private Fresher insertFresher() {
        Scanner scanner = ScannerFactory.getScanner();
        return (Fresher) createEmployee(scanner, 1);
    }

    private Intern insertIntern() {

        Scanner scanner = ScannerFactory.getScanner();
        return (Intern) createEmployee(scanner, 2);
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

//        try {
//            checkData(employee);
//        }catch (FullNameException e) {
////            // insert  => insert(type);
////            insert(type);
////        }
//        catch (BirthdayException e) {
//            // insert  => insert(type);
//            insert(type);
//        } catch (PhoneException e) {
//            // insert  => insert(type);
//            insert(type);
//        } catch (EmailException e) {
//            // insert  => insert(type);
//            insert(type);
//        }
        this.employeeManager.insert(employee);
    }

    //        public void checkData(Employee employee) throws BirthdayException, PhoneException, EmailException, FullNameException{
//        ValidatorService.birthdayCheck(employee.getBirthday());
//        ValidatorService.phoneCheck(employee.getPhone());
//        ValidatorService.emailCheck(employee.getEmail());
//        ValidatorService.nameCheck(employee.getFullName());
//    }
    public static boolean containsLetterRegex(String input) {
        Pattern pattern = Pattern.compile(".*[a-zA-Z].*");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static boolean containsBirthdayRegex(String input) {
        Pattern pattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public void updateEmployee(String id) {
        Scanner scanner = ScannerFactory.getScanner();
        Employee employeeUpdate = employeeManager.findById(id);
        if (employeeUpdate != null) {
            System.out.println("Enter update information");
            String fullName;
            while (true) {
                try {
                    System.out.print("Input full name: ");
                    fullName = scanner.nextLine();
                    fullName = Arrays.stream(fullName.trim().replaceAll("\\s+", " ").split(" "))
                            .map(w -> w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase())
                            .collect(Collectors.joining(" "));
                    ValidatorService.nameCheck(fullName);
                    employeeUpdate.setFullName(fullName);
                    break;
                } catch (FullNameException e) {
                    System.out.println(e.getMessage());
                }
            }

            LocalDate birthday = null;
            String birthdayString;
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            while (true) {
                System.out.println("Input birthday(dd-MM-yyyy): ");
                birthdayString = scanner.nextLine();
                birthdayString = birthdayString.trim();
                if (containsLetterRegex(birthdayString) || !containsBirthdayRegex(birthdayString)) {
                    System.out.println("Date is invalid. Entry please!!");
                } else {
                    try {
                        birthday = LocalDate.parse(birthdayString, dateTimeFormatter);
                        ValidatorService.birthdayCheck(birthday);
                        employeeUpdate.setBirthday(birthday);
                        break;
                    } catch (BirthdayException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

            String phone;
            while (true) {
                try {
                    System.out.print("Input Phone: ");
                    phone = scanner.nextLine();
                    ValidatorService.phoneCheck(phone);
                    employeeUpdate.setPhone(phone);
                    break;
                } catch (PhoneException e) {
                    System.out.println(e.getMessage());
                }
            }

            String email;
            while (true) {
                try {
                    System.out.print("Input Email: ");
                    email = scanner.nextLine();
                    ValidatorService.emailCheck(email);
                    employeeUpdate.setEmail(email);
                    break;
                } catch (EmailException e) {
                    System.out.println(e.getMessage());
                }
            }

            List<Certificate> certificates = null;
            if (employeeUpdate instanceof Experience) {
                System.out.println("Input experience in year: ");
                int expInYear = scanner.nextInt();
                ((Experience) employeeUpdate).setExpInYear(expInYear);
                scanner.nextLine();
                System.out.println("Input pro skill: ");
                String proSkill = scanner.nextLine();
                ((Experience) employeeUpdate).setProSkill(proSkill);

            } else if (employeeUpdate instanceof Fresher) {
                LocalDate graduationDate = null;
                String graduationDateString;
                while (true) {
                    System.out.println("Input graduation date(dd-MM-yyyy): ");
                    graduationDateString = scanner.nextLine().trim();
                    if (containsLetterRegex(graduationDateString) || !containsBirthdayRegex(graduationDateString)) {
                        System.out.println("Graduation date is invalid. Entry please!!");
                    } else {
                        try {
                            graduationDate = LocalDate.parse(graduationDateString, dateTimeFormatter);
                            ValidatorService.birthdayCheck(graduationDate);
                            ((Fresher) employeeUpdate).setGraduationDate(graduationDate);
                            break;
                        } catch (BirthdayException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                }


                System.out.println("Input graduation rank: ");
                String graduationRank = scanner.nextLine();
                ((Fresher) employeeUpdate).setGraduationRank(graduationRank);

                System.out.println("Input education: ");
                String education = scanner.nextLine();
                ((Fresher) employeeUpdate).setEducation(education);
            } else {
                System.out.println("Input majors: ");
                String majors = scanner.nextLine();
                ((Intern) employeeUpdate).setMajors(majors);
                System.out.println("Input semester: ");
                int semester = scanner.nextInt();
                ((Intern) employeeUpdate).setSemester(semester);
                scanner.nextLine();
                System.out.println("Input university name: ");
                String universityName = scanner.nextLine();
                ((Intern) employeeUpdate).setUniversityName(universityName);
            }

        }

    }
}

