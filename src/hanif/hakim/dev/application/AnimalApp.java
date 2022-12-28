package hanif.hakim.dev.application;

import hanif.hakim.dev.data.Animal;
import hanif.hakim.dev.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Guppy";
        animal.run();
    }
}
