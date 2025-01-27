class Book {
    // Instance Variables
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Get the author
    public String getAuthor() {
        return author;
    }

    // Setter
    public void setAuthor(String author) {
        this.author = author;
    }
}

// Inheritance
class EBook extends Book {

    // Constructor
    public EBook(String ISBN, String title, String author) {
        // Calling the parent class constructor
        super(ISBN, title, author);
    }

    // Method to display EBook details
    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        // Create an Object
        EBook ebook = new EBook("978-3-16-148410-0", "Java Programming", "John Doe");

        // Display EBook details
        ebook.displayEBookDetails();

        // Modify author name using the public setter method
        ebook.setAuthor("Jane Smith");

        // Display updated EBook details
        System.out.println("\nAfter updating author:");
        ebook.displayEBookDetails();
    }
}
