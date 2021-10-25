package core12;

import java.util.Arrays;
import java.util.List;

public class Registration{
    List<String> registeredEmails = Arrays.asList("abc@gmail.com", "xyz@gmail.com");

    public void validateEmail(String email) throws EmailException {
        if (registeredEmails.contains(email)) {
            throw new EmailException("Email Already Registered");
        }
    }
}