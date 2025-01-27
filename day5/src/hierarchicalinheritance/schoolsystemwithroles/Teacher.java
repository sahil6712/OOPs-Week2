package hierarchicalinheritance.schoolsystemwithroles;

class Teacher extends Person {
    // attribute
    String subject = null;

    // constructors
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    // displaying roles

    public void displayRole() {
        System.out.println("Role is Teacher");
    }

    @Override
    public void display() {
        super.display();
        displayRole();
    }

}

