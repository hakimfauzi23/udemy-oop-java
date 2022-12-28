package hanif.hakim.dev.data;

public class Product {
    /*
     * Create Product class inside hanif.hakim.dev package!
     */

    /*
     * Access modifier 'protected' can be use in same package only
     * Access modifier 'public' can be use in all place.
     */ 
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
