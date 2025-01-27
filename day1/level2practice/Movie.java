import java.util.Scanner;

class MovieTicket {

    // Class Attributes
    String movieName = "Sholay";
    int price = 300;
    int seatNumber;

    //Method for ticket booking
    public void bookTicket() {
        //Allocate seat for booking ticket
        seatNumber = 9;

    }

    //Method for showing the Ticket detail
}

public class Movie {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        //Prompt the user 
        System.out.print("Book a ticket Enter Movie(Sholay, stuart) Name: ");
        String movieName = input.nextLine();

        //Create

        input.close();
    }
    
}
