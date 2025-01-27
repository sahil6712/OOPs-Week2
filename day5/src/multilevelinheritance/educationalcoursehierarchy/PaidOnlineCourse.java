package multilevelinheritance.educationalcoursehierarchy;

public class PaidOnlineCourse extends OnlineCourse {

    // Attributes
    private final int fee;
    private final int discount;

    // Constructor
    PaidOnlineCourse(String courseName, String platform, int duration, int fee, int discount, boolean isRecorded) {
        super(courseName, platform, duration, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Fee for the course is: "+fee);
        System.out.println("Discount is: "+discount);
    }

}
