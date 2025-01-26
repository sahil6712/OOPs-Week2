package librarymanagementsystem;

class Book extends LibraryItem implements Reservable {
    private boolean isReserved;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 14; // Example: Books can be loaned for 14 days
    }

    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println(getTitle() + " has been reserved.");
        } else {
            System.out.println(getTitle() + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

