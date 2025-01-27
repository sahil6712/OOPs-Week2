package assistedproblems.vehicletransportsystem;

public class Main {
    public static void main(String[] args) {

        // Instance of car
        Car car = new Car(290, "Petrol",4);

        // Instance of truck
        Truck truck = new Truck(170,"Diesel", "Container");

        // Instance of a MotorCycle
        MotorCycle motorCycle = new MotorCycle(220, "Electric",15);

        //Array of Vehicle
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = car;
        vehicles[1] = truck;
        vehicles[2] = motorCycle;

        //Display info for each object of vehicles arrays
        for(Vehicle vehicle:vehicles) {
            vehicle.displayInfo();
        }

    }
}
