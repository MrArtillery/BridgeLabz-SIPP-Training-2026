class Vehicle {

    public double fuelCost(double km) {
        return 0;
    }
}

class Car extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 8;   // ₹8 per km
    }
}

class Bus extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 15;  // ₹15 per km
    }
}

class Bike extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 3;   // ₹3 per km
    }
}

// New class added without changing existing classes
class ElectricCar extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 2;   // ₹2 per km
    }
}

public class TransportCompany {

    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        double distance = 100;

        for (Vehicle vehicle : fleet) {

            System.out.println(
                    vehicle.getClass().getSimpleName()
                            + " Fuel Cost = ₹"
                            + vehicle.fuelCost(distance));

            // Using instanceof before casting
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("This is a Car.");
            } else if (vehicle instanceof Bus) {
                Bus bus = (Bus) vehicle;
                System.out.println("This is a Bus.");
            } else if (vehicle instanceof Bike) {
                Bike bike = (Bike) vehicle;
                System.out.println("This is a Bike.");
            } else if (vehicle instanceof ElectricCar) {
                ElectricCar ec = (ElectricCar) vehicle;
                System.out.println("This is an Electric Car.");
            }

            System.out.println();
        }
    }
}
