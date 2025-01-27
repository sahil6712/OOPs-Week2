package assistedproblems.vehicletransportsystem;

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
