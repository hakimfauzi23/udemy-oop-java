class VicePresident extends Manager {
    /*
     * Because VicePresident is inherite Manager class
     * All of properties and method Manager class can be used
     * by VicePresident Object
     */

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is VP" + this.name);
    }
}
