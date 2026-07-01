class Book {

    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    // Parameterized Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " " + author + " ₹" + price);
    }
}

public class BookDemo {

    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Java", "James Gosling", 500);

        b1.display();
        b2.display();
    }
}
