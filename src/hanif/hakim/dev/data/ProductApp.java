package hanif.hakim.dev.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Lenovo A10", 12000000);
        // System.out.println(product.name);
        // System.out.println(product.price);

        System.out.println(product);

        Product product2 = new Product("Lenovo A10", 12000000);

        // True!! Because the equals() method already override!
        System.out.println(product.equals(product2)); 
        
        // True!! Because the hashCode() method already override!
        System.out.println(product.hashCode() == product2.hashCode()); 
    }
}
