package multilevelinheritance.educationalcoursehierarchy;

public class Main {
    public static void main(String[] args) {

        // Creating an instance of the PainOnlineCourse
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Java Full Stack","Youtube",4,3322,1000,true);

        // Display the details
        paidCourse.displayCourseDetails();
    }
}
