package ecommerce;

abstract class Product {

    // Attributes of Product class
    String productId;
    String name;
    int price;

    // Constructor
    Product(String productId, String name, int price) {
        this.price = price;
        this.name = name;
        this.productId = productId;
    }

    // Method to calculate distance
    abstract int calculateDiscount();

    // Method to get the final price
    abstract void finalPrice();
}
