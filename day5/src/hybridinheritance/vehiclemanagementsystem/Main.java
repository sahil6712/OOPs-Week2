package hybridinheritance.vehiclemanagementsystem;

public class Main {
    public static void main(String[] args) {
        PetrolVehicle petrolVehicle1 = new PetrolVehicle("xyz", 200);
        ElectricVehicle electricVehicle1 = new ElectricVehicle("Abc", 100);

        petrolVehicle1.display();
        petrolVehicle1.refuel();

        electricVehicle1.display();
        electricVehicle1.charge();
    }
}
