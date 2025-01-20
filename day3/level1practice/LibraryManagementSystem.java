class Book {
    private static String libraryName = "Sahil's realm of Knowldege";
    private String title;
    private String author;
    private final int isbn;

    // Constructor to initialize
    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to print the name of library
    public static void displayLibraryName() {
        System.out.print("\nName of library is: "+libraryName+'\n');
    }

    // Methods to display the book detail
    public void display() {
        System.out.println("\nTitle of book: "+title);
        System.out.println("Author of Book is: "+author);
        System.out.println("isbn of Book is: "+isbn);
    }
}

public class LibraryManagementSystem {
    public static void main(String args[]) {

        //Name of Library using static method of book class
        Book.displayLibraryName();

        // Create object of Book
        Book book1 = new Book("Armstrong", "Neil", 1234567);
        if(book1 instanceof Book) {     // Check book1 is instance of Book
            book1.display();
        }

        Book book2 = new Book("Life", "Sahil",7654321);
        if(book2 instanceof Book) {      // // Check book2 is instance of Book
            if(book2 instanceof Book) {
                book2.display();
            }
        }
    }
}
