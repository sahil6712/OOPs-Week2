package hybridinheritance.vehiclemanagementsystem;

class Vehicle {
    // attributes
    String model = null;
    int maxSpeed = -1;

    // constructor
    Vehicle(String model, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // default constructor
    Vehicle() {};

    // display
    void display() {
        System.out.println("Model is : "+ model + " and max speed is : "+ maxSpeed);
    }
}
