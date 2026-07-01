class Book {

    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {

        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {

    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void display() {

        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + getAuthor());
    }
}

public class BookLibrarySystem {

    public static void main(String[] args) {

        EBook book =
                new EBook("978123456", "Java Programming", "James");

        book.display();

        book.setAuthor("Ankur");

        System.out.println("Updated Author : " + book.getAuthor());
    }
}
