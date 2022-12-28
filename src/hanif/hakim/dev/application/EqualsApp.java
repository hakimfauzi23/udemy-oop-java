package hanif.hakim.dev.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Hanif";
        first = first + " " + "Hakim";

        System.out.println(first);

        String second = "Hanif Hakim";
        System.out.println(second);

        System.out.println(first == second); // False (is it the same object?);

        String third = "Hanif Hakim";
        System.out.println(second == third); // True (because previous string is same);

        System.out.println(first.equals(second)); // True (use equals method to compare object)
    }
}
