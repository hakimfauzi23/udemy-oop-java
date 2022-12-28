package hanif.hakim.dev.data;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); This is ERROR

        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
