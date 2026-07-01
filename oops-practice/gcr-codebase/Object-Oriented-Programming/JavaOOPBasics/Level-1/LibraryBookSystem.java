class Book {

    String title;
    String author;
    double price;
    boolean availability;

    Book(String title, String author, double price) {

        this.title = title;
        this.author = author;
        this.price = price;
        availability = true;
    }

    void borrowBook() {

        if (availability) {
            availability = false;
            System.out.println("Book Borrowed Successfully");
        } else {
            System.out.println("Book Not Available");
        }
    }

    void display() {

        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : ₹" + price);
        System.out.println("Available : " + availability);
    }
}

public class LibraryBookSystem {

    public static void main(String[] args) {

        Book book = new Book("Java", "James Gosling", 500);

        book.display();

        book.borrowBook();

        book.display();
    }
}
