abstract class Vehicle {

    // Private fields
    private String vehicleNumber;
    private String vehicleType;

    // Constructor
    public Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    // Getters and Setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Abstract Method
    public abstract double calculateRentalCost(int days);

    // Concrete Method
    public void displayVehicleInfo() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicleType);
    }
}

class Car extends Vehicle {

    private double dailyRate;

    public Car(String vehicleNumber,
               String vehicleType,
               double dailyRate) {

        super(vehicleNumber, vehicleType);
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Bike extends Vehicle {

    private double dailyRate;

    public Bike(String vehicleNumber,
                String vehicleType,
                double dailyRate) {

        super(vehicleNumber, vehicleType);
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Truck extends Vehicle {

    private double dailyRate;
    private double loadingCharge;

    public Truck(String vehicleNumber,
                 String vehicleType,
                 double dailyRate,
                 double loadingCharge) {

        super(vehicleNumber, vehicleType);
        this.dailyRate = dailyRate;
        this.loadingCharge = loadingCharge;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getLoadingCharge() {
        return loadingCharge;
    }

    public void setLoadingCharge(double loadingCharge) {
        this.loadingCharge = loadingCharge;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

public class VehicleRentalSystem {

    public static void main(String[] args) {

        int days = 5;

        Car car = new Car("CAR101", "Car", 1500);

        Bike bike = new Bike("BIKE201", "Bike", 500);

        Truck truck = new Truck("TRK301",
                "Truck",
                3000,
                2000);

        System.out.println("Car Details");
        car.displayVehicleInfo();
        System.out.println("Rental Cost : ₹" + car.calculateRentalCost(days));

        System.out.println();

        System.out.println("Bike Details");
        bike.displayVehicleInfo();
        System.out.println("Rental Cost : ₹" + bike.calculateRentalCost(days));

        System.out.println();

        System.out.println("Truck Details");
        truck.displayVehicleInfo();
        System.out.println("Rental Cost : ₹" + truck.calculateRentalCost(days));
    }
}
