package vehiclerentalsystem;

public class Main {
    public static void main(String[] args) {
        // Create an array of vehicles
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new CarWithInsurance("CAR123", 100, "INS123");
        vehicles[1] = new BikeWithInsurance("BIKE456", 50, "INS456");
        vehicles[2] = new TruckWithInsurance("TRUCK789", 200, "INS789");

        // Iterate over vehicles and calculate rental and insurance costs
        for (Vehicle vehicle : vehicles) {
            // Calculate rental cost for 5 days
            double rentalCost = vehicle.calculateRentalCost(5);
            System.out.println("Vehicle Type: " + vehicle.getType() + ", Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost for 5 days: $" + rentalCost);

            // Check if vehicle is insurable and calculate insurance cost
            if (vehicle instanceof Insurable insurableVehicle) {
                double insuranceCost = insurableVehicle.calculateInsurance();
                System.out.println("Insurance Cost: $" + insuranceCost);
                System.out.println("Insurance Details: " + insurableVehicle.getInsuranceDetails());
            }
            System.out.println();
        }
    }
}
