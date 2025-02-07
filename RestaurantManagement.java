interface Worker {
    void performDuties();
}

class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " | ID: " + id);
    }
}

class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println("Preparing meals, specializing in " + specialty);
    }
}

class Waiter extends Person implements Worker {
    private int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    public void performDuties() {
        System.out.println("Serving customers, managing " + tablesAssigned + " tables");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("John", 102, 5);

        chef.displayInfo();
        chef.performDuties();

        waiter.displayInfo();
        waiter.performDuties();
    }
}

