package multilevelinheritance.onlineretailordermanagement;

public class Main {
    public static void main(String[] args) {

    // Instance of DeliveredOrder
    DeliveredOrder dOrder = new DeliveredOrder("odr322", "24/01/2025", 32456, "27/01/2025");

    // Display the status of order
        dOrder.getOrderStatus();
    }

}

