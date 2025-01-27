class Student {
    // Instance Variables
    public int rollNumber;  
    protected String name;   
    private double CGPA;     

    // Constructor to initialize the student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Update CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

// Inheritance
class PostgraduateStudent extends Student {

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        // Calling the parent class constructor
        super(rollNumber, name, CGPA);
    }

    // Method to display the details of a postgraduate student
    public void displayPostgraduateDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);              
        System.out.println("CGPA: " + getCGPA());         
    }
}

// UniversityManagement
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create an object of PostgraduateStudent
        PostgraduateStudent pgStudent = new PostgraduateStudent(24, "Sahil", 8.5);

        // Display student details using the method from PostgraduateStudent class
        pgStudent.displayPostgraduateDetails();

        // Update CGPA 
        pgStudent.setCGPA(9.0);

        // Display updated student details
        System.out.println("\nAfter updating CGPA:");
        pgStudent.displayPostgraduateDetails();
    }
}
