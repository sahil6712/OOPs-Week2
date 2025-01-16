class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    // Constructor
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = 0; 
        this.price = 0.0;
    }

    // Method to book a ticket
    public void bookTicket(int seatNumber) {
        if (seatNumber <= 0) {
            System.out.println("Invalid seat number.");
            return;
        }
        this.seatNumber = seatNumber;
        this.price = calculatePrice();
        System.out.println("Ticket booked successfully for movie: " + movieName);
    }

    // Method to calculate price
    private double calculatePrice() {
        return 10.0 + (seatNumber * 0.9);
    }

    // Method to display the ticket details
    public void displayTicketDetails() {
        if (seatNumber == 0) {
            System.out.println("Ticket has not been booked yet.");
        } else {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        }
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        // Create a Object
        MovieTicket ticket1 = new MovieTicket("Manjhi The Mountain Man");

        // Display initial ticket details
        ticket1.displayTicketDetails();

        // Book ticket by seat number
        ticket1.bookTicket(5);

        // Display ticket details after booking
        ticket1.displayTicketDetails();
    }
}
