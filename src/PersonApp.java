public class PersonApp {
    public static void main(String[] args) {

        /*
         * This is how to create object from Class Person
         * Each Object is independent! not related from another object
         * that has same class.
         */
        var person1 = new Person("John Doe","Venice");
        Person person2 = new Person("Will Smith", "Hollywood");
        var person3 = new Person();
        person3.name = "James Jone";
        person3.address = "Octagon";

        /*
         * The class field can be modified each object separate
         */        
        System.out.println(person1.name);
        System.out.println(person2.name);

        /*
         * This is how class method are called!
         */
        person1.sayHello("Johnny");
        person2.sayHello("Sean");
        person3.sayHello("Mark");


    }
}
