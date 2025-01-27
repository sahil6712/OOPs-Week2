package multilevelinheritance.onlineretailordermanagement;

public class DeliveredOrder extends ShippedOrder {

    // Attribute
    private final String deliveryDate;

    // Constructor
    DeliveredOrder(String orderId, String orderDate, int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Method to get the order status
    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery date of the product is: "+deliveryDate);
    }
}
