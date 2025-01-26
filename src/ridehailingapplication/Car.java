package ridehailingapplication;

class Car extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor
    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Implement calculateFare() specific to Car
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // Fare = rate per km * distance
    }

    // Implement GPS methods
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

