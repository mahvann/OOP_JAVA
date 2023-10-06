package Exercises.bai13.service;

import Exercises.bai13.exception.BirthdayException;
import Exercises.bai13.exception.EmailException;
import Exercises.bai13.exception.FullNameException;
import Exercises.bai13.exception.PhoneException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorService {
    public static void birthdayCheck(LocalDate birthday) throws BirthdayException{

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate now =LocalDate.parse("06-10-2023",dateTimeFormatter);
        if(birthday.compareTo(now) >= 0){
            throw new BirthdayException("Date invalid. Please try again.");
        }

    }
    public static void phoneCheck(String phone) throws PhoneException {
        Pattern pattern = Pattern.compile("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
        Matcher matcher = pattern.matcher(phone);
         if(!matcher.matches()){
             throw new  PhoneException("Phone is invalid. Please try again.");
         }
    }

    public static void emailCheck(String email) throws EmailException {
        if(!email.contains("@") || !email.contains(".com")){
            throw new EmailException("Email is invalid. Please try again.");
        }
    }

    public static void nameCheck(String name) throws FullNameException {
        Pattern pattern = Pattern.compile("^[a-zA-Z ]+$");
        Matcher matcher = pattern.matcher(name);
        if(!matcher.matches()){
            throw new FullNameException("Full name is invalid. Please try again.");
        }
    }
}
