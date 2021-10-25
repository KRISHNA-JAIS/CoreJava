package core12;

public class ClientRegistration {
    public static void main(String[] args) {
        Registration service = new Registration();
        try {
            service.validateEmail("abc@gmail.com");
        } catch (EmailException e) {
            System.out.println(e);
            // logging and handling the situation
        }
    }
}
