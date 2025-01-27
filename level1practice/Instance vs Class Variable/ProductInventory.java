class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable 
    private static int totalProducts = 0;

    // Constructor to initialize the product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display the total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        // Creating Product objects
        Product product1 = new Product("Laptop", 9000.00);
        Product product2 = new Product("Smartphone", 1000.00);

        // Displaying details for each product
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();
        System.out.println();

        System.out.println("Product 2 Details:");
        product2.displayProductDetails();
        System.out.println();

        // Display the total number of products created
        Product.displayTotalProducts(); 
    }
}
