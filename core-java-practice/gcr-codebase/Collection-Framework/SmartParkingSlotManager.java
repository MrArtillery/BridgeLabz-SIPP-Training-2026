import java.util.ArrayList;

public class SmartParkingSlotManager {

    private ArrayList<String> parkedVehicles = new ArrayList<>();

    // 1. Add vehicle when it enters
    public void addVehicle(String regNumber) {
        parkedVehicles.add(regNumber);
        System.out.println("Vehicle entered: " + regNumber);
    }

    // 2. Remove vehicle when it exits
    public void removeVehicle(String regNumber) {
        if (parkedVehicles.remove(regNumber)) {
            System.out.println("Vehicle exited: " + regNumber);
        } else {
            System.out.println("Vehicle not found: " + regNumber);
        }
    }

    // 3. Search vehicle
    public void searchVehicle(String regNumber) {
        if (parkedVehicles.contains(regNumber)) {
            System.out.println(regNumber + " is currently parked.");
        } else {
            System.out.println(regNumber + " is not parked.");
        }
    }

    // 4. Display all parked vehicles + total slots occupied
    public void displayVehicles() {
        System.out.println("\nCurrently Parked Vehicles:");
        if (parkedVehicles.isEmpty()) {
            System.out.println("No vehicles parked.");
        } else {
            for (String vehicle : parkedVehicles) {
                System.out.println(vehicle);
            }
        }
        System.out.println("Total Occupied Slots: " + parkedVehicles.size());
    }

    public static void main(String[] args) {
        SmartParkingSlotManager parking = new SmartParkingSlotManager();

        parking.addVehicle("UP32AB1234");
        parking.addVehicle("DL01CD5678");
        parking.addVehicle("MH12EF9012");

        parking.searchVehicle("DL01CD5678");

        parking.removeVehicle("UP32AB1234");

        parking.displayVehicles();
    }
}
