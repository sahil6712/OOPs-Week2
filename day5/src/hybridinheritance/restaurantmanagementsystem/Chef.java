package hybridinheritance.restaurantmanagementsystem;

class Chef extends Person implements Worker {
    @Override
    public void performDuties() {
        System.out.println("Working on making food");
    }
    // constructor

    Chef(String name, int id) {
        super(name, id);
    }

    // invoking superClass display
    void display() {
        super.display();
    }

}