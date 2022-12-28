package hanif.hakim.dev.application;

import hanif.hakim.dev.data.Avanza;
import hanif.hakim.dev.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
