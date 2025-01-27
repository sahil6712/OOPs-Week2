package multilevelinheritance.educationalcoursehierarchy;

public class Course {
    // Attributes
    String courseName;
    int duration;

    // Constructor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    //Display details
    void displayCourseDetails() {
        System.out.println("Name of the course is: "+courseName);
        System.out.println("Duration of the course in months: "+duration);
    }

}
