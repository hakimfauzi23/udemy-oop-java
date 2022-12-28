package hanif.hakim.dev.data;

public class Bus implements Car {

    public void drive() {

    }

    public int getTire() {
        return 8;
    }

    public String getBrand() {
        return "Hino";
    }

    public boolean isMaintenanced() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}
