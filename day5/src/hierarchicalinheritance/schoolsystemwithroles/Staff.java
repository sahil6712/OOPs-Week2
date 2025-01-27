package hierarchicalinheritance.schoolsystemwithroles;

class Staff extends Person {
    // attribute
    String designation = null;

    // constructors
    public Staff(String name, int age, String designation) {
        super(name, age);
        this.designation = designation;
    }

    public Staff(String designation) {
        this.designation = designation;
    }

    // displaying roles

    public void displayRole() {
        System.out.println("Role is : "+ designation);
    }

    @Override
    public void display() {
        super.display();
        displayRole();
    }

}
