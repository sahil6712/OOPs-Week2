class Product {

    // Class Attributes
    private final int productId;
    private String productName;
    private int price;
    private int quantity;
    private static int discount = 12;

    // Constructor
    Product(String productName, int price, int quantity, int productId) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;
    }

    public static void updateDiscount(int newDiscount) {
        discount = newDiscount;
    }

    // Method to display product details
    public void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
        System.out.println("Product Id: " + productId);
        System.out.println("Product Quantity: " + quantity);
        System.out.println("Discount Percentage is: " + discount);
    }

}

public class ShoppingCartSystem {
    public static void main(String args[]) { // Object of Product class
        Product product1 = new Product("Laptop", 100000, 1, 213);
        if (product1 instanceof Product) {
            product1.display();
        }

        // Update discount
        Product.updateDiscount(18);

        System.out.println("\nProduct details after updating discount: ");
        if (product1 instanceof Product) {
            product1.display();
        }
    }
}
