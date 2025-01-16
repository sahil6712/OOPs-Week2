class CartItem {
    String itemName;
    int price;
    int quantity;

    // Constructor to initialize the cart item
    public CartItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

}

class Cart {
    int size = 5; // size of cart

    // Array to store cartitem
    CartItem[] item = new CartItem[size];

    int index = 0; // Track last item added;

    // Adding items to the cart
    public void addItem(String itemName, int price, int quantity) {
        if (index >= size) {
            System.out.println("The cart is full remove item to add new one. ");
            return;
        } else {
            item[index] = new CartItem(itemName.toLowerCase(), price, quantity);
            index++;
        }
    }

    // Method to remove cart items
    public void removeItem(String itemName) {
        //iterate item array
        for(int i=0; i<index; i++) { 
            if(item[i].itemName.equals(itemName.toLowerCase())) { 
                index = index-1;         // Reduce the index
                for(int j=i; j<index; j++) {
                    item[j] = item[j+1];
                }
                System.out.println("The element removed is "+item[i].itemName);
                return;
            }
        }
        System.out.println("No such item in the cart");
    }

    // Method to display total price
    public void totalPrice() {
        int sum = 0; //for storing the cost of items
        for(int i=0; i<index; i++) {
            sum += item[i].price*item[i].quantity;
        }

        System.out.println("Total price of all item is: "+sum);
    }

    //Method to display items in cart
    public void displayCartItems() {
        for(int i=0; i<index; i++) {
            System.out.println(item[i].itemName+" "+item[i].price+" "+item[i].quantity);
        }
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        
    //Create object of the cart
    Cart newCart = new Cart();   // Default size of character is 5

    //Adding items to the cart
    newCart.addItem("Trouser", 23234, 2);
    newCart.addItem("Shirt", 2234, 2);
    newCart.addItem("SmartPhone", 23234, 1);
    newCart.addItem("Laptop", 92234, 1);
    newCart.addItem("Fav", 2214, 3);
    
    //Display cart after adding items
    System.out.println("Cart after adding items");
    System.out.println("");
    newCart.displayCartItems();

    //Remove item from cart
    newCart.removeItem("fav");

    //Display cart after Removing items
    System.out.println("Cart after Removin items items");
    newCart.displayCartItems();

    //Total price in the cart
    newCart.totalPrice();

    }
}
