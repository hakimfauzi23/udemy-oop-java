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
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
        this(null);
    }

    /*
     * This is Class Method. can be called with
     * init object first inside a variable.
     */
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}
