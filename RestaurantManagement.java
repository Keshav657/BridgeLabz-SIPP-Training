package Inheritance;

// Superclass
class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Worker interface
interface Worker {
    void performDuties();
}

// Chef subclass
class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " (ID: " + id + ") prepares " + specialty + " dishes.");
    }
}

// Waiter subclass
class Waiter extends Person implements Worker {
    private int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " (ID: " + id + ") serves " + tablesAssigned + " tables.");
    }
}

// Demo
public class RestaurantManagement {
    public static void main(String[] args) {
        Worker chef = new Chef("Alice", 101, "Italian");
        Worker waiter = new Waiter("Bob", 201, 5);

        chef.performDuties();
        waiter.performDuties();
    }
}
