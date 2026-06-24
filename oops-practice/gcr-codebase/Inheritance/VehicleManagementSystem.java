interface Refuelable {

    void refuel();
}

class Vehicle {

    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayVehicleInfo() {
        System.out.println("Model     : " + model);
        System.out.println("Max Speed : " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {

    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println(model + " is charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is being refueled.");
    }
}

public class VehicleManagementSystem {

    public static void main(String[] args) {

        ElectricVehicle ev =
                new ElectricVehicle(180, "Tesla Model 3");

        PetrolVehicle pv =
                new PetrolVehicle(220, "Toyota Corolla");

        System.out.println("Electric Vehicle");
        ev.displayVehicleInfo();
        ev.charge();

        System.out.println("\nPetrol Vehicle");
        pv.displayVehicleInfo();
        pv.refuel();
    }
}
