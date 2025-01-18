class Book {

    // Attributes
    private String title;
    private String author;
    private int price;

    // Default constructor
    Book() {
        title = "Life";
        author = "Sahil";
        price = 1000;
    }

    // Parametrized Character
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book
    public void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }
}

public class BookDetails {
    public static void main(String args[]) {

        // Create object using Default constructor
        Book book1 = new Book();

        // Create object using Parametrized constructor
        Book book2 = new Book("The Crux", "Sahil", 900);

        System.out.println("Properties of object created using default constructor:");
        book1.display(); // Display details of book1 object

        System.out.println("\n Properties of object created using Parametrized Constructor: ");
        book2.display(); // Display details of book2 object

    }
}