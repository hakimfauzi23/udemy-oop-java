class Parent {
    String name;

    void doiIt() {
        System.out.println("Do it in parent");
    }
}

class Child extends Parent {
    String name; //

    void doiIt() {
        System.out.println("Do it in child");
    }
}