abstract class Employee {

    //Attributes 
    String name;
    String empId;
    int salary;

    // Constructor 
    Employee(String name, String empId, int salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    // Method to display details of employee
    abstract void displayDetails();
}

class Manager extends Employee {

    //Employee class attribute
    private int teamSize;

    // Constructor
    Manager(String name, String empId, int salary, int teamSize) {
        super(name, empId, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        System.out.println("Name of Manager is: "+name);
        System.out.println("Employee id of Manager is: "+empId);
        System.out.println("Salary of Manager is: "+salary);
        System.out.println("Team size is: "+teamSize+"\n");
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    // Constructor
    Developer(String name, String empId, int salary, String programmingLanguage) {
        super(name, empId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        System.out.println("Name of Developer is: "+name);
        System.out.println("Employee id of Developer is: "+empId);
        System.out.println("Salary of Developer is: "+salary);
        System.out.println("Programming language in which Developer works: "+programmingLanguage+"\n");
    }


}

class Intern extends Employee {
    private int internshipDuration;

    // Constructor
    Intern(String name, String empId, int salary, int internshipDuration) {
        super(name, empId, salary);
        this.internshipDuration = internshipDuration;
    }

    @Override
    void displayDetails() {
        System.out.println("Name of Intern is: "+name);
        System.out.println("Temporary Employee id of Intern is: "+"");
        System.out.println("Salary of Manager is: "+salary);
        System.out.println("Internship duration in months: "+internshipDuration+"\n");
    }
}

public class EmployeeManagementSystem {
    public static void main(String args[]) {

        //Instance of Manager class
        Manager ramesh = new Manager("Ramesh","emp132",100000,7);
        ramesh.displayDetails();

        //Instance of Developer
        Developer sahil = new Developer("Sahil Khemariya","emp927",99999999,"Java");
        sahil.displayDetails();

        //Instance of intern
        Intern assDas = new Intern("Assdas", "emp321", 19000, 1);
        assDas.displayDetails();
    }
}