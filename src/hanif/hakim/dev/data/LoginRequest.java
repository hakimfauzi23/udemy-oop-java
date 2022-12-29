package hanif.hakim.dev.data;

/*
 * Record Cannot be extends another class
 * It can be only implement the interface!
 */
public record LoginRequest(String username, String password) {

    /*
     * This is Record Constructor!
     * Don't have ( )
     */
    public LoginRequest {
        System.out.println("This is constructor");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

    /*
     * This is Method in Java Record
     */
    public void name() {

    }
}
