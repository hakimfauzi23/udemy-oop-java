public class PolymorphismApp {
    public static void main(String[] args) {

        sayHello(new Employee("Eko"));
        sayHello(new Manager("Joko"));
        sayHello(new VicePresident("Budi"));
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
