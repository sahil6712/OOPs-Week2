package hybridinheritance.restaurantmanagementsystem;

class Waiter extends Person implements Worker {
    @Override
    public void performDuties() {
        System.out.println("Serving food");
    }

    // constructor
    Waiter(String name, int id) {
        super(name, id);
    }

    // calling super display
    void display() {
        super.display();
    }
}
