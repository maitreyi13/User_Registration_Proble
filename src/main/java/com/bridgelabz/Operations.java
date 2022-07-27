package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations {
    static Scanner sc = new Scanner(System.in);
    public static boolean validFirstName() {
        System.out.print("Enter first name: ");
        String name = sc.next();
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(name);
        boolean result = match.matches();
        if (result) {
            System.out.println("Your First name is valid");
        }
        else {
            System.out.println("Your First name is invalid");
        }
        return result;
    }
    public static boolean validLastName() {
        System.out.print("Enter the Last name: ");
        String nameLast = sc.next();
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(nameLast);
        boolean result = m.matches();
        if (result)
            System.out.println("Your Last name is valid");
        else
            System.out.println("Your Last name is invalid");
        return result;
    }
    public static boolean validEmailAddress(){
        System.out.print("Enter the Email Address:  ");
        String emailId = sc.next();

        String regex = "^[a-z]{3}[a-zA-z.]*@+bl.co+[a-z.]*$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(emailId);
        boolean result = m.matches();
        if (result)
            System.out.println("Your Email Address is valid");
        else
            System.out.println("Your Email Address is invalid");
        return result;
    }
    public static boolean validMobileNumber(String mobNumber) {
        String regex = "^\\d{2}\\s?\\d{10,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobNumber);
        boolean result = matcher.matches();
        if (result)
            System.out.println("Your Mobile Number is valid");
        else
            System.out.println("Your Mobile Number is invalid");
        return result;
    }
}