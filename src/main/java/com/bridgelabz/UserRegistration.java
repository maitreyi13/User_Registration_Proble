package com.bridgelabz;
import java.util.Scanner;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("*** Welcome to User Registration problem ***");
        int choose;
        int select;
        do {
            System.out.print("Press \n1.First Name Validation \n2.Last Name Validation : ");
            choose = sc.nextInt();
            switch (choose) {
                case 1 -> Operations.validFirstName();
                case 2 -> Operations.validLastName();
                default -> System.out.println("Invalid: Enter valid details.");
            }
            System.out.print("Press \n1.Continue \n2.Exit : ");
            select = sc.nextInt();
        }while (select != 2);
        System.out.println("Thank You!");
    }
}