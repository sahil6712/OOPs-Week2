class Course {
    // Instance variables
    private String courseName;
    private int duration; // Duration in months (for example)
    private double fee;

    // Class variable 
    private static String instituteName = "Sagar Study Center";

    // Constructor to initialize the course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update the institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

public class CourseManagement {
    public static void main(String[] args) {
        // Create Course objects for different courses
        Course course1 = new Course("Java Programming", 5, 500.0);
        Course course2 = new Course("CPP", 15, 1200.0);
        Course course3 = new Course("Data Structures", 13, 1100.0);

        // Display the course details for each course
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();
        System.out.println();

        System.out.println("Course 2 Details:");
        course2.displayCourseDetails();
        System.out.println();

        System.out.println("Course 3 Details:");
        course3.displayCourseDetails();
        System.out.println();

        // Update the institute name for all courses
        Course.updateInstituteName("Online SSC");

        // Display course details again after updating institute name
        System.out.println("Updated Course Details After Changing Institute Name:\n");
        course1.displayCourseDetails();
        System.out.println();

        course2.displayCourseDetails();
        System.out.println();

        course3.displayCourseDetails();
    }
}
