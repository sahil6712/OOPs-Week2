package hybridinheritance.vehiclemanagementsystem;

class PetrolVehicle extends Vehicle implements Refuelable {
    @Override
    public void refuel() {
        System.out.println("refuling the vehicle");
    }
    // constructor
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    @Override
    void display() {
        super.display();
    }
}
