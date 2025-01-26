package librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Create different library items with updated examples
        LibraryItem book1 = new Book("B101", "The Catcher in the Rye", "J.D. Salinger");
        LibraryItem magazine1 = new Magazine("M202", "Time Magazine", "Henry Luce");
        LibraryItem dvd1 = new DVD("D303", "The Dark Knight", "Christopher Nolan");

        LibraryItem book2 = new Book("B104", "Brave New World", "Aldous Huxley");
        LibraryItem magazine2 = new Magazine("M205", "Wired", "Conde Nast");
        LibraryItem dvd2 = new DVD("D306", "Gladiator", "Ridley Scott");

        // Display details of all items
        System.out.println(book1.getItemDetails());
        System.out.println("Loan Duration: " + book1.getLoanDuration() + " days\n");

        System.out.println(magazine1.getItemDetails());
        System.out.println("Loan Duration: " + magazine1.getLoanDuration() + " days\n");

        System.out.println(dvd1.getItemDetails());
        System.out.println("Loan Duration: " + dvd1.getLoanDuration() + " days\n");

        System.out.println(book2.getItemDetails());
        System.out.println("Loan Duration: " + book2.getLoanDuration() + " days\n");

        System.out.println(magazine2.getItemDetails());
        System.out.println("Loan Duration: " + magazine2.getLoanDuration() + " days\n");

        System.out.println(dvd2.getItemDetails());
        System.out.println("Loan Duration: " + dvd2.getLoanDuration() + " days\n");

        // Polymorphism
        Reservable[] items = { (Reservable) book1, (Reservable) magazine1, (Reservable) dvd1,
                (Reservable) book2, (Reservable) magazine2, (Reservable) dvd2 };

        // Reserve and check availability
        for (Reservable item : items) {
            System.out.println("Checking availability: " + item.checkAvailability());
            item.reserveItem();
            System.out.println("Checking availability after reservation: " + item.checkAvailability());
            System.out.println();
        }
    }
}
