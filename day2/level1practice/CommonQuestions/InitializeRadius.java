import java.util.Scanner;

class Circle {

    // Attributes
    double radius;

    // Default Constructor
    Circle() {
        radius = 10.0;
        System.out.println("Default radius of a circle is: " + radius);
    }

    // Parameterized Constructor
    Circle(double radius) {
        this(); // Calling the default constructor
        this.radius = radius;
        System.out.println("The user defined value of Radius is: " + radius);
    }

}

public class InitializeRadius {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter radius
        System.out.println("Enter radius of a circle: ");
        double radius = input.nextDouble();

        // Call the parametrized constructor
        Circle circle1 = new Circle(radius);
    }
}