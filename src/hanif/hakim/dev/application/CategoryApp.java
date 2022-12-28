package hanif.hakim.dev.application;

import hanif.hakim.dev.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("ID");
        category.setId(null);
        System.out.println(category.getId());
        
    }
}
