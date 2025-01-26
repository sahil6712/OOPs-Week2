package librarymanagementsystem;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters for encapsulation
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Abstract method for loan duration
    public abstract int getLoanDuration();

    // Concrete method to get item details
    public String getItemDetails() {
        return "Item ID: " + itemId + "\nTitle: " + title + "\nAuthor: " + author;
    }
}

