package hierarchicalinheritance.schoolsystemwithroles;

public class Main {
    public static void main(String[] args) {

        // example to demonstrate roles

        Teacher teacher1 = new Teacher("Sahil", 24, "Science");
        Staff staff1 = new Staff("Keshav", 24, "Cleaning");
        Student student1 = new Student("Ram", 24, "A+");

        teacher1.display();
        staff1.display();
        student1.display();
    }
}
