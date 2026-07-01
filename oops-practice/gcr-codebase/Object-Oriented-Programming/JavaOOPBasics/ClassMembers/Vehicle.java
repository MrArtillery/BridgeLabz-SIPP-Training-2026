class Vehicle {

    // Instance Variables
    String ownerName;
    String vehicleType;

    // Class Variable
    static double registrationFee = 5000;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method
    void displayVehicleDetails() {

        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : ₹" + registrationFee);
    }

    // Class Method
    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Ankur", "Car");
        Vehicle v2 = new Vehicle("Rahul", "Bike");

        v1.displayVehicleDetails();
        System.out.println();

        Vehicle.updateRegistrationFee(7000);

        v2.displayVehicleDetails();
    }
}
