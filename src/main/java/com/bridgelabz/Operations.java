package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface validFirstName{
    boolean validateFirstName(String message) throws InvalidFirstNameException;
}
interface validLastName{
    boolean validateLastName(String message) throws InvalidLastNameException;
}
interface validEmailId {
    boolean validateEmailID(String message) throws InvalidEmailIdException;
}
interface validMobileNumber{
    boolean validateMobNumber(String message) throws InvalidMobileNumberException;
}
interface validPassword{
    boolean validatePassword(String message) throws InvalidPasswordException;
}
public class Operations {

    validFirstName fNameValidate = fName -> {
        if (fName == null) {
            throw new InvalidFirstNameException("Null Pointer Exception");
        } else if (fName.length() == 0) {
            throw new InvalidFirstNameException("Empty Exception ");
        }
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fName);
        boolean result = m.matches();
        System.out.println(result);
        if (!m.matches()) {
            throw new InvalidFirstNameException("first Name should start with a Cap and should have minimum 3 chars");
        } else
            return true;
    };

    validLastName lNameValidate = lName -> {
        if (lName == null) {
            throw new InvalidLastNameException("Null Pointer Exception");
        } else if (lName.length() == 0) {
            throw new InvalidLastNameException("Empty Exception ");
        }
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lName);
        boolean result = m.matches();
        System.out.println(result);
        if (!m.matches()) {
            throw new InvalidLastNameException("Last Name should start with a Cap and should have minimum 3 chars");
        } else
            return true;
    };
    validEmailId emailIDValidate = mailId -> {
        if (mailId == null) {
            throw new InvalidEmailIdException("Null Pointer Exception");
        } else if (mailId.length() == 0) {
            throw new InvalidEmailIdException("Empty Exception ");
        }
        String regex = "^[a-z]{3,}(.[-+a-z\\d]*)?@([a-z\\d])+.[a-z]{2,}+(.[a-z]{2,})*";
        Pattern P1 = Pattern.compile(regex);
        Matcher M1 = P1.matcher(mailId);
        boolean result = M1.matches();
        System.out.println(result);
        if (!M1.matches()) {
            throw new InvalidEmailIdException("enter a valid email - E.g. abc.xyz@bl.co.in ");
        } else
            return true;
    };

    validMobileNumber mobNumberValidate = mobNo -> {
        if (mobNo == null) {
            throw new InvalidMobileNumberException("Null Pointer Exception");
        } else if (mobNo.length() == 0) {
            throw new InvalidMobileNumberException("Empty Exception ");
        }
        String regex = "^\\d{2}\\s\\d{10,}$";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(mobNo);
        boolean result = m1.matches();
        System.out.println(result);
        if (!m1.matches()) {
            throw new InvalidMobileNumberException("Enter the Valid Mobile number with county code eg:- 91 8764314432");
        } else
            return true;
    };

    validPassword passwordValidate = password -> {
        if (password == null) {
            throw new InvalidPasswordException("Null Pointer Exception");
        } else if (password.length() == 0) {
            throw new InvalidPasswordException("Empty Exception ");
        }
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(password);
        boolean result = m1.matches();
        System.out.println(result);
        if (!m1.matches()) {
            throw new InvalidPasswordException("Password should Contain min 8 chars with at least: 1 capital letter, 1 numeric and exactly 1 special character ");
        } else
            return true;
    };
}