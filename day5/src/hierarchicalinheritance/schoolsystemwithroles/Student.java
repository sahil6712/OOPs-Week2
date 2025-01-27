package hierarchicalinheritance.schoolsystemwithroles;

class Student extends Person {
    // attribute
    String grade = null;

    // constructors
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public Student(String grade) {
        this.grade = grade;
    }

    // displaying roles

    public void displayRole() {
        System.out.println("Role is Student");
    }

    @Override
    public void display() {
        super.display();
        displayRole();
    }

}
