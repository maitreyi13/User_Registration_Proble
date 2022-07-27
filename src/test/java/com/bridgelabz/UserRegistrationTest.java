package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    Operations operations = new Operations();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(operations.fNameValidate.validateFirstName("Neha"));
            System.out.println("First Name is valid");
        }catch (InvalidFirstNameException e){
            System.out.println("Invalid First Name " + e);
        }
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(operations.lNameValidate.validateLastName("Joshi"));
            System.out.println("Last Name is valid");
        }catch (InvalidLastNameException e){
            System.out.println("Invalid last name " + e);
        }
    }
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(operations.emailIDValidate.validateEmailID("neha123@co.bl"));
            System.out.println("Email Id is valid ");
        }catch (InvalidEmailIdException e){
            System.out.println("Invalid Email ID " + e);
        }
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        try {
            Assertions.assertTrue(operations.mobNumberValidate.validateMobNumber("91 8796415236"));
            System.out.println("Mobile number is valid ");
        }catch (InvalidMobileNumberException e){
            System.out.println("Invalid Mobile Number" + e);
        }
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue()  {
        try {
            Assertions.assertTrue(operations.passwordValidate.validatePassword("Neha@1234"));
            System.out.println("Password is valid");
        }catch (InvalidPasswordException e){
            System.out.println("Invalid Password " + e);
        }
    }
}