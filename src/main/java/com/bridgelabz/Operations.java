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
}