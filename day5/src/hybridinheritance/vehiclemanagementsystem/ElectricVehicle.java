package hybridinheritance.vehiclemanagementsystem;

class ElectricVehicle extends Vehicle implements Chargeable {
    @Override
    public void charge() {
        System.out.println("Charging the vehicle");
    }

    // constructor
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    @Override
    void display() {
        super.display();
    }

}