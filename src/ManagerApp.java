class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Damar";
        manager.sayHello("Joko");

        var vp = new VicePresident();
        vp.name = "Sonny";
        vp.sayHello("Joko");
    }
}
