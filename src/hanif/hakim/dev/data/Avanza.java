package hanif.hakim.dev.data;

/*
 * Class that implement Car interface
 * MUST be OVERRIDE ALL of It's Method!
 */
public class Avanza implements Car {

    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTire() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenanced() {
        return false;
    }
}
