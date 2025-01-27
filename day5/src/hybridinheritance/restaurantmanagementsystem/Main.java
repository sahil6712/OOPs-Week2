package hybridinheritance.restaurantmanagementsystem;

public class Main {
    public static void main(String[] args) {
        Chef chef1 = new Chef("Rahul", 9574);

        Waiter waiter1 = new Waiter("abcd", 9572);

        chef1.display();
        chef1.performDuties();

        waiter1.display();
        waiter1.performDuties();
    }
}
