package multilevelinheritance.educationalcoursehierarchy;

public class OnlineCourse extends Course {

    // Attributes
    protected String platform;
    protected boolean isRecorded;

    // Constructor
    OnlineCourse(String courseName, String platform, int duration, boolean isRecorded) {
        super(courseName, duration);
        this.isRecorded = isRecorded;
        this.platform = platform;
    }

    @Override
    void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("You can access our course on: "+platform);
        if(isRecorded)
            System.out.println("Lectures are Recorded");

        else
            System.out.println("Lectures are Live");
    }
}
