package assistedproblems.vehicletransportsystem;

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
