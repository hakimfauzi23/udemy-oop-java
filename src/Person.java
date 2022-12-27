class Person {

    /*
     * This Is A Person Class
     * Class Name And File Name Must Be Same!
     */

    /*
     * These below are Class field or properties!
     * All object from this class will have them.
     */
    String name;
    String address;
    final String country = "Indonesia";

    /*
     * This is a class constructor
     * Constructor name must be same with Class Name
     * Constructor is to set properties right after the object class is created!
     * Able to Overloading (create same method but with diff properties or param)
     */
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Person(String name) {
        this(name, null);
    }

    Person() {
        this(null);
    }

    /*
     * This is Class Method. can be called with
     * init object first inside a variable.
     */
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }
}
