package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = Operations.validFirstName("Neha");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenProper_ShouldReturnFalse() {
        boolean result = Operations.validFirstName("neha");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = Operations.validLastName("Joshi");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnFalse() {
        boolean result = Operations.validLastName("joshi");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean result = Operations.validEmailAddress("neha.joshi@bl.co");
        System.out.println(result);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnFalse() {
        boolean result = Operations.validEmailAddress("%neha@.gmail.com");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean result = Operations.validMobileNumber("91 8796415236");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnFalse() {
        boolean result = Operations.validMobileNumber("91 7416");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean result = Operations.validPassword("Neha%joshi1234");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    //Sad test case for Password
    @Test
    public void givenPassword_WhenProper_ShouldReturnFalse() {
        boolean result = Operations.validPassword("neha1234");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
}