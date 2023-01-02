package hanif.hakim.dev.application;

import hanif.hakim.dev.data.LoginRequest;
import hanif.hakim.dev.error.ValidationException;
import hanif.hakim.dev.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null, null);

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException  exception) {
            System.out.println("Data tidak valid: " + exception.getMessage());
        } finally {
            System.out.println("Always be executed");
        }
    }
}
