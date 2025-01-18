class Employee {
    // Instance Variables
    public int employeeID; 
    protected String department; 
    private double salary; 

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Modify salary
    public void modifySalary(double newSalary) {
        this.salary = newSalary;
    }

    // Get salary
    public double getSalary() {
        return salary;
    }
}

// Inheritance
class Manager extends Employee {

    // Constructor 
    public Manager(int employeeID, String department, double salary) {
        // Calling the parent class constructor
        super(employeeID, department, salary);
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        // Create an object of Manager
        Manager manager = new Manager(96, "Sales", 25000.0);

        // Display manager details
        manager.displayManagerDetails();

        // Modify salary using the public method
        manager.modifySalary(60000.0);

        // Display updated manager details
        System.out.println("\nAfter updating salary:");
        manager.displayManagerDetails();
    }
}
