class MovieTicket {

    String movieName;
    String seatNumber;
    double price;

    // Constructor
    public MovieTicket(String movieName,
                       String seatNumber,
                       double price) {

        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {

        this.seatNumber = seatNumber;
        this.price = price;

        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    public void displayTicketDetails() {

        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price      : ₹" + price);
    }
}

public class MovieTicketBooking {

    public static void main(String[] args) {

        MovieTicket ticket =
                new MovieTicket(
                        "Avengers: Endgame",
                        "",
                        0);

        ticket.bookTicket("A12", 350);

        System.out.println();

        ticket.displayTicketDetails();
    }
}
