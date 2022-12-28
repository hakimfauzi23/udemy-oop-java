public class ParentApp {
    /*
     * In java there's not properties overidding
     * so either on Parent and Child class the variable is independent!
     * Is it not recommend to create variable with same name in parent and child
     * class!
     */
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Hakim";
        child.doiIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doiIt();
    }
}
