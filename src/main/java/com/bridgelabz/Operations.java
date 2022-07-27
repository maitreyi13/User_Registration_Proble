package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations {
    public static boolean validFirstName(String name) throws InvalidFirstNameException {
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(name);
        if (!m.matches()){
            throw new InvalidFirstNameException("Should start with capital letter and have min 3 letters");
        }
        else
            return true;
    }
    public static boolean validLastName(String nameLast) throws InvalidLastNameException {
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(nameLast);

        if (!m.matches()){
            throw new InvalidLastNameException("Should start with capital letter and have min 3 letters");
        }
        else
            return true;
    }
    public static boolean validEmailAddress(String emailId) throws InvalidEmailIdException{
        String regex = "^[a-z]{3}[a-zA-z.]*@+bl.co+[a-z.]*$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(emailId);
        if(!m.matches()){
            throw new InvalidEmailIdException("Enter valid email address");
        }else
            return true;
    }
    public static boolean validMobileNumber(String mobNumber) throws InvalidMobileNumberException {
        String regex = "^\\d{2}\\s?\\d{10,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(mobNumber);
        if (!m.matches()){
            throw new InvalidMobileNumberException("Enter the Valid mobile number with county code.");
        }else
            return true;
    }
    public static boolean validPassword(String password) throws InvalidPasswordException {
        String regex = "^(?=.*[A-z])(?=.*\\d)(?=.*[@#$%^&*()-+=])([a-zA-Z\\d@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(password);
        if (!m.matches()){
            throw new InvalidPasswordException("Password should Contain min 8 chars with at least: 1 capital letter, 1 numeric and 1 special character ");
        }else
            return true;
    }
}