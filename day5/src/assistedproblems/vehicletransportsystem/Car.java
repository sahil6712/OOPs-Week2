package assistedproblems.vehicletransportsystem;

class Car extends Vehicle {
    // Attribute of Car class
    private final int seatCapacity;

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
