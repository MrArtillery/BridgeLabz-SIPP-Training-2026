class CarRental {

    String customerName;
    String carModel;
    int rentalDays;

    CarRental() {
        customerName = "Guest";
        carModel = "Swift";
        rentalDays = 1;
    }

    CarRental(String customerName,
              String carModel,
              int rentalDays) {

        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * 2000;
    }

    void display() {

        System.out.println("Customer : " + customerName);
        System.out.println("Car : " + carModel);
        System.out.println("Rental Days : " + rentalDays);
        System.out.println("Total Cost : ₹" + calculateTotalCost());
    }
}

public class CarRentalDemo {

    public static void main(String[] args) {

        CarRental rental =
                new CarRental("Ankur", "Honda City", 5);

        rental.display();
    }
}
