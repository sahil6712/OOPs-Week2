class Student {
    // Static variable shared by all students
    static String universityName;
    static int totalStudents = 0;

    // Instance variables
    final int rollNumber; 
    String name;
    String grade;

    // Constructor
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; 
    }

    // Static method to display total number of students
    public static void displayTotalStudents() {
        System.out.println("Total number of students enrolled: " + totalStudents);
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("University: " + universityName);
    }

    // Method to update grade if the object is an instance of Student
    public void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + this.grade);
        } else {
            System.out.println("Error: The object is not a Student instance.");
        }
    }

}

public abstract class UniversityStudentManagement {

    public static void main(String[] args) {
        
        Student.universityName = "SFX University";

        // Creating student objects
        Student student1 = new Student("Aren", 11, "A");
        Student student2 = new Student("roxy", 24, "C");

        // Displaying student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        // Display total students
        Student.displayTotalStudents();

        // Updating grade for a student using 'instanceof'
        student1.updateGrade(student1, "A+");

    }
}
