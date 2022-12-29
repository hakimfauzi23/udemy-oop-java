package hanif.hakim.dev.application;

import hanif.hakim.dev.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Hanif", "hakim112233");
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
    }
}
