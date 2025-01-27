package singleinheritance.librarymanagement;

public class Book {

    // Attributes of book class
    String title;
    int publicationYear;

    // Constructor
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display information
    void displayInfo() {
        System.out.println("Title of the book is: "+title);
        System.out.println("Publication year of the book is: "+publicationYear);
    }

}
