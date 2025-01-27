package singleinheritance.librarymanagement;

public class Author extends Book {
    // Attributes of author
    private final String name;
    private final String bio;

    // constructor
    Author(String name, String bio, String title, int publicationYear) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // method to display details
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Name of author is: "+name);
        System.out.println("Author bio: "+bio);
    }
}
