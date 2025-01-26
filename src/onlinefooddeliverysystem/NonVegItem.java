package onlinefooddeliverysystem;

class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;  // Additional charge for non-veg items
    private double discountPercentage;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
    }

    // Override calculateTotalPrice() to include additional charge for non-veg items
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + additionalCharge;
    }

    // Implement applyDiscount() to apply discount for non-veg items
    @Override
    public void applyDiscount(double percentage) {
        this.discountPercentage = percentage;
    }

    // Implement getDiscountDetails() to show discount details
    @Override
    public String getDiscountDetails() {
        return "Discount on " + getItemName() + ": " + discountPercentage + "%";
    }
}
