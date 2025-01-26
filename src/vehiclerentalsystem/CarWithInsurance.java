package vehiclerentalsystem;

class CarWithInsurance extends Car implements Insurable {
    private String policyNumber;

    public CarWithInsurance(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // Example: 5% of rental price as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + policyNumber;
    }
}