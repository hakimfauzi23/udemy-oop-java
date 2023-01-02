package hanif.hakim.dev.application;

import hanif.hakim.dev.error.DatabaseError;

public class DatabaseApp {
    /*
     * Error type recommended to not use try and catch!
     */
    public static void main(String[] args) {
        connectDatabase(null, "Rahasia");
        System.out.println("Success!");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Cannot connect to db");
        }
    }
}
