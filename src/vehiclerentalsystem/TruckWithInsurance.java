package vehiclerentalsystem;

class TruckWithInsurance extends Truck implements Insurable {
    private String policyNumber;

    public TruckWithInsurance(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.07; // Example: 7% for truck insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + policyNumber;
    }
}
