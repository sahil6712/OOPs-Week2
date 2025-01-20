class Vehicle {
    // Static variables
    static double registrationFee = 900.0;

    // Instance variables
    final String registrationNumber; 
    String ownerName;
    String vehicleType;

    // Constructor
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: " + registrationFee);
    }

    // Method to display vehicle registration details
    public void displayRegistrationDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Check before displaying registration details
    public void showRegistrationDetails(Object obj) {
        if (obj instanceof Vehicle) {
            this.displayRegistrationDetails();
        } else {
            System.out.println("Error: The object is not a Vehicle instance.");
        }
    }

}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Creating
        Vehicle vehicle1 = new Vehicle("Kali Das", "Scooter", "WSA214");
        Vehicle vehicle2 = new Vehicle("Kabir Das", "Car", "VW5678");

        // Displaying registration details
        vehicle1.showRegistrationDetails(vehicle1);
        vehicle2.showRegistrationDetails(vehicle2);

        // Displaying updated registration fee
        Vehicle.updateRegistrationFee(1000.0);

        // Displaying registration details again after fee update
        vehicle1.showRegistrationDetails(vehicle1);
        vehicle2.showRegistrationDetails(vehicle2);

    }
}
