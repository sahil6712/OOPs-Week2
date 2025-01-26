package ridehailingapplication;

import java.util.ArrayList;
import java.util.List;


public class Main {
     public static void main(String[] args) {
         // Create vehicle instances (using Indian context)
         Vehicle car = new Car("CAR123", "Ravi Kumar", 15.0, "Delhi");
         Vehicle bike = new Bike("BIKE456", "Arvind Singh", 8.0, "Bangalore");
         Vehicle auto = new Auto("AUTO789", "Suresh Yadav", 10.0, "Mumbai");

         // List to store vehicles in the system
         List<Vehicle> vehicles = new ArrayList<>();
         vehicles.add(car);
         vehicles.add(bike);
         vehicles.add(auto);

         // Sample distance for fare calculation
         double distance = 10.0; // in kilometers

         // Calculate fare for each vehicle type dynamically
         System.out.println("Ride-Hailing Application - Fare Calculation (Indian Context)\n");

         for (Vehicle vehicle : vehicles) {
             System.out.println(vehicle.getVehicleDetails());
             System.out.println("Estimated Fare for " + distance + " km: ₹" + vehicle.calculateFare(distance));
             System.out.println();
         }

         // Update location using GPS interface
         System.out.println("Updating vehicle locations...\n");
         if (car instanceof GPS) {
             ((GPS) car).updateLocation("New Delhi");
             System.out.println("Car Location Updated: " + ((GPS) car).getCurrentLocation());
         }

         if (bike instanceof GPS) {
             ((GPS) bike).updateLocation("Mumbai");
             System.out.println("Bike Location Updated: " + ((GPS) bike).getCurrentLocation());
         }

         if (auto instanceof GPS) {
             ((GPS) auto).updateLocation("Kolkata");
             System.out.println("Auto Location Updated: " + ((GPS) auto).getCurrentLocation());
         }
     }
}
