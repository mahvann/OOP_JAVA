package Exercises.bai13.service;

import Exercises.bai13.exception.BirthdayException;
import Exercises.bai13.exception.EmailException;
import Exercises.bai13.exception.FullNameException;
import Exercises.bai13.exception.PhoneException;

import java.time.LocalDate;

public class ValidatorService {
    public static void birthdayChek(LocalDate birthday) throws BirthdayException{
        LocalDate now = LocalDate.now();
        if(birthday.compareTo(now) >= 0){
            throw new BirthdayException("Invalid date of birth ");
        }
    }
    public static void phoneChek(String phone) throws PhoneException {

    }

    public static void emailChek(String phone) throws EmailException {

    }

    public static void nameCheck(String name) throws FullNameException {

    }
}
