package hanif.hakim.dev.application;

import hanif.hakim.dev.data.*;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Lenovo Gaming i3", 1200000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
