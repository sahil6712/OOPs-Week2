package multilevelinheritance.onlineretailordermanagement;

public class Order {

    // Attributes
    String orderId;
    String orderDate;

    // Constructor
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to display status of order
    void getOrderStatus() {
        System.out.println("OrderId is: "+orderId);
        System.out.println("Order Date: "+orderDate);
    }

}
