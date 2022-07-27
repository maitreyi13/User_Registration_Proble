package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(Operations.validFirstName("Neha"));
            System.out.println("Valid First Name.");
        }catch (InvalidFirstNameException e){
            System.out.println("Invalid First Name: " + e);
        }
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(Operations.validLastName("Joshi"));
            System.out.println("Valid Last name");
        }catch (InvalidLastNameException e){
            System.out.println("Invalid Last Name: " + e);
        }
    }
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(Operations.validEmailAddress("neha123@co.bl"));
            System.out.println("Valid Email Address");
        }catch (InvalidEmailIdException e){
            System.out.println("Invalid Email ID: " + e);
        }
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(Operations.validMobileNumber("91 8796415236"));
            System.out.println("Valid mobile Number.");
        }catch (InvalidMobileNumberException e){
            System.out.println("Invalid Mobile Number: " + e);
        }
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue()  {
        try {
            Assertions.assertTrue(Operations.validPassword("Neha@1234"));
            System.out.println("Valid Password.");
        }catch (InvalidPasswordException e){
            System.out.println("Invalid Password: " + e);
        }
    }
}