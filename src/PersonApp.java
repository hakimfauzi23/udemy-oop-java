public class PersonApp {
    public static void main(String[] args) {

        /*
         * This is how to create object from Class Person
         * Each Object is independent! not related from another object
         * that has same class.
         */
        var person1 = new Person();
        Person person2 = new Person();

        /*
         * The class field can be modified each object separate
         */
        person1.name = "John Doe";
        person1.address = "Venice";
        
        person2.name = "Will Smith";
        person2.address = "Hollywood";
        
        System.out.println(person1.name);
        System.out.println(person2.name);

        /*
         * This is how class method are called!
         */
        person1.sayHello("Johnny");
        person2.sayHello("Sean");
    }
}
