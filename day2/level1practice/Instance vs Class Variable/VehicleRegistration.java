class Vehicle {
    // Instance Variables
    private String ownerName;
    private String vehicleType;

    // Class Variable
    private static double registrationFee = 600.0;

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee; 
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        // Create Vehicle objects
        Vehicle vehicle1 = new Vehicle("Sahil Khaimariya", "Car");
        Vehicle vehicle2 = new Vehicle("Mushoku Tensei", "Bike");

        // Display vehicle details
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();

        System.out.println("Vehicle 2 Details:");
        vehicle2.displayVehicleDetails();
        System.out.println();

        // Update the registration fee for all vehicles
        Vehicle.updateRegistrationFee(150.0);

        // Display updated vehicle details
        System.out.println("Updated Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();

        System.out.println("Updated Vehicle 2 Details:");
        vehicle2.displayVehicleDetails();
    }
}
