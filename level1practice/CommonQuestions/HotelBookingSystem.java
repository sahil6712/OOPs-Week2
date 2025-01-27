import java.util.Scanner;

class HotelBooking { 

    // Attributes of class
    private String guestName; 
    private String roomType;
    private int nights;

    // Default Constructor
    HotelBooking() {
        guestName = "Not Provided";
        roomType = "Standard rooms";
        nights = 1;
    }

    //Parameterized Constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    //Copy constructor
    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    // display data
    public void display() {
        System.out.println("Guest name: "+guestName);
        System.out.println("Room type: "+roomType);
        System.out.println("Nights to stay "+nights);
    }

}

public class HotelBookingSystem {
    public static void main(String args[]) {

        // Create object of class
        HotelBooking obj1 = new HotelBooking();
        HotelBooking obj2 = new HotelBooking("jack", "suite",2);
        HotelBooking obj3 = new HotelBooking(obj2);

        //Displaying diffrent objects
        System.out.println("Hotel Booking Details using default constructor object: ");
        obj1.display();

        System.out.println("\nHotel Booking Details using parameterized constructor: ");
        obj2.display();

        System.out.println("\nHotel Booking Details using copy constructor: ");
        obj3.display();

    }
}
