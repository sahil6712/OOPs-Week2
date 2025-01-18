class CarRental {
    // Attributes of the CarRental class
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Constructor to initialize the rental details
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        double dailyRate = 500;
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost()+"\n");
    }

}

public class CarRentalSystem {
    public static void main(String[] args) {
        // Create CarRental objects with new rental details
        CarRental rental1 = new CarRental("Shivish chnjha", "BMW X5", 10);
        CarRental rental2 = new CarRental("Yuvij Dantha", "Audi Q7", 4);
        CarRental rental3 = new CarRental("Sahil Khaimariya", "Mercedes-Benz GLC", 2);

        System.out.println("Car Rental Details:");
        rental1.displayRentalDetails();

        rental2.displayRentalDetails();

        rental3.displayRentalDetails();


    }
}
