import java.util.Scanner;

class Person {
    float height;
    float weight;
    String color;

    // Parameterized Constructor
    Person(float height, float weight, String color) {
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    // Copy Constructor
    Person(Person pr) {
        this.height = pr.height;
        this.weight = pr.weight;
        this.color = pr.color;
    }

    // Display attributes of Person
    public void display() {
        System.out.println("Height of person is: " + height);
        System.out.println("Weight of Person is: " + weight);
        System.out.println("Skin Color of Person is: " + color);
    }
}

public class CopyPerson {
    public static void main(String args[]) {

        // Create Object
        Person pr = new Person(6.6f, 90.0f, "Light Brown");

        // Create object using Person copy constructor
        Person pr1 = new Person(pr);

        // Getting attributes of person using object pr
        System.out.println("\nAttributes using object created by parameterized Constructor");
        pr.display();

        // Getting attribute of person using object pr1
        System.out.println("\nAttributes using object created by Copy Constructor \n");
        pr1.display();

    }
}
