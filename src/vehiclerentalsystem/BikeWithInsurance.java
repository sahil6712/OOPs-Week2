package vehiclerentalsystem;

class BikeWithInsurance extends Bike implements Insurable {
    private String policyNumber;

    public BikeWithInsurance(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.03; // Example: 3% for bike insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + policyNumber;
    }
}