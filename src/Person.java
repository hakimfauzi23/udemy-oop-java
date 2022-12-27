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
     * This is Class Method. can be called with
     * init object first inside a variable.
     */
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}
