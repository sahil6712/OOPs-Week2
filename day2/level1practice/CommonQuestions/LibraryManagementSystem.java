class Book {
    // Attributes of the Book class
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor to initialize a Book object
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; 
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
        }
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {
        // Create some Indian Book objects
        Book book1 = new Book("The God of Small Things", "Arundhati Roy", 499.99);
        Book book2 = new Book("Midnight's Children", "Salman Rushdie", 399.99);
        Book book3 = new Book("The White Tiger", "Aravind Adiga", 349.99);

    
        book1.borrowBook(); 
        book2.borrowBook();  
        book3.borrowBook(); 

        // This will be unavailable now
        book1.borrowBook();  

        
    }
}
