package hanif.hakim.dev.application;

import hanif.hakim.dev.data.CreateUserRequest;
import hanif.hakim.dev.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        ValidationUtil.validationReflection(request);
    }
}
