package multilevelinheritance.onlineretailordermanagement;

public class ShippedOrder extends Order {

    // Attribute
    protected int trackingNumber;

    // Constructor
    ShippedOrder(String orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Method to display order status
    @Override
    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking number of the product is: "+trackingNumber);
    }
}
