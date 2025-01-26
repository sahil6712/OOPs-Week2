package onlinefooddeliverysystem;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create different food items
        FoodItem vegItem1 = new VegItem("Veg Burger", 500, 2);
        FoodItem nonVegItem1 = new NonVegItem("Chicken Sandwich", 449, 3, 2.00);
        FoodItem vegItem2 = new VegItem("Veg Pizza", 239, 1);
        FoodItem nonVegItem2 = new NonVegItem("Fish Fry", 1099, 2, 3.50);

        // List to store the food items in an order
        List<FoodItem> foodOrder = new ArrayList<>();
        foodOrder.add(vegItem1);
        foodOrder.add(nonVegItem1);
        foodOrder.add(vegItem2);
        foodOrder.add(nonVegItem2);

        // Apply discount to food items
        if (vegItem1 instanceof Discountable) {
            ((Discountable) vegItem1).applyDiscount(10);  // 10% discount
        }
        if (nonVegItem1 instanceof Discountable) {
            ((Discountable) nonVegItem1).applyDiscount(5);  // 5% discount
        }

        // Display order details and calculate total price
        double totalOrderPrice = 0;
        System.out.println("Order Details:\n");
        for (FoodItem item : foodOrder) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());
            if (item instanceof Discountable) {
                System.out.println(((Discountable) item).getDiscountDetails());
            }
            System.out.println();
            totalOrderPrice += item.calculateTotalPrice();
        }

        // Display the final total order price
        System.out.println("Total Order Price: " + totalOrderPrice);
    }
}
