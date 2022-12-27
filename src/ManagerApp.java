class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Damar");
        manager.sayHello("Joko");

        var vp = new VicePresident("Sonny");
        vp.sayHello("Joko");
    }
}
