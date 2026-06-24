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
}

class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing and cooking food.");
    }
}

class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is taking orders and serving customers.");
    }
}

public class RestaurantManagementSystem {

    public static void main(String[] args) {

        Chef chef = new Chef("Ankur", 101);
        Waiter waiter = new Waiter("Rahul", 201);

        System.out.println("Chef Details");
        System.out.println("Name : " + chef.name);
        System.out.println("ID   : " + chef.id);
        chef.performDuties();

        System.out.println("\nWaiter Details");
        System.out.println("Name : " + waiter.name);
        System.out.println("ID   : " + waiter.id);
        waiter.performDuties();
    }
}
