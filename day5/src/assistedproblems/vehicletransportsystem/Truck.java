package assistedproblems.vehicletransportsystem;

class Truck extends Vehicle {
    //Attributes
    private final String typeOfTruck;

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
