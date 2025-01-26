package onlinefooddeliverysystem;

class VegItem extends FoodItem implements Discountable {
    private double discountPercentage;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Override calculateTotalPrice() for veg item (no additional charges)
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    // Implement applyDiscount() to apply discount for veg items
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
