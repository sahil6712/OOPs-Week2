import java.util.Scanner;

class Student {

    // Class Attributes
    String name;
    int rollno;
    int marks;

    // Constructor
    Student(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    // Method to get the student Grade
    public void getGrades(String name, int rollno, int marks) {

        //Get the grade 
        char grade = 'A';
        if (marks >= 80)
            grade = 'A';
        else if (marks >= 70)
            grade = 'B';
        else if (marks >= 50)
            grade = 'C';
        else
            grade = 'R';

        //displaying the result
        System.out.print("Student "+name+" and rollno "+rollno+" got marks "+marks+" and grade "+grade);

    }
}

class StudentDetails {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter Student details
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Rollno: ");
        int rollno = input.nextInt();

        System.out.print("Enter marks(less than 100): ");
        int marks = input.nextInt();

        // Create the object of Student
        Student student = new Student(name, rollno, marks);

        // For getting the grade and displaying the result
        student.getGrades(name, rollno, marks);

        input.close();
    }
}