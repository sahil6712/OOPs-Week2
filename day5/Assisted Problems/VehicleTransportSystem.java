abstract class Vehicle {

    // Attributes of vehicle class
    int maxSpeed;
    String fuelType;

    // Constructors
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    //Method definition to display info
    abstract void displayInfo();
}

class Car extends Vehicle {
    // Attribute of Car class
    private int seatCapacity;

    // Constructor
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Maximum speed of car is: "+maxSpeed);
        System.out.println("Type of fuel car uses: "+fuelType);
        System.out.println("Sitting capacity of car is: "+seatCapacity+"\n");
    }

}

class Truck extends Vehicle {
    //Attributes
    private String typeOfTruck;

    //Constructor
    Truck(int maxSpeed, String fuelType, String typeOfTruck) {
        super(maxSpeed, fuelType);
        this.typeOfTruck = typeOfTruck;
    }

    @Override
    void displayInfo() {
        System.out.println("Maximum speed of Truck is: "+maxSpeed);
        System.out.println("Type of fuel Truck uses: "+fuelType);
        System.out.println("Type of truck: "+typeOfTruck+"\n");
    }

}

class MotorCycle extends Vehicle {

    //Attributes
    int fuelCapacity;

    // Constructor
    MotorCycle(int maxSpeed, String fuelType, int fuelCapacity) {
        super(maxSpeed, fuelType);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Maximum speed of bike is: "+maxSpeed);
        System.out.println("Type of fuel bike uses: "+fuelType);
        System.out.println("Fuel capacity of bike is: "+fuelCapacity+"\n");
    }

}

public class VehicleTransportSystem {
    public static void main(String args[]) {

        // Instance of car
        Car car = new Car(290, "Petrol",4);

        // Instance of truck
        Truck truck = new Truck(170,"Diesel", "Container");

        // Instance of a MotorCycle
        MotorCycle motorCylce = new MotorCycle(220, "Electric",15);

        //Array of Vehicle
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = car;
        vehicles[1] = truck;
        vehicles[2] = motorCylce;

        //Display info for each object of vehicles array
        for(Vehicle vehicle:vehicles) {
            vehicle.displayInfo();
        }

    }
}