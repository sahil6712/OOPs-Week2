package employeemanagementsystem;

abstract class Employee {

    // Attributes of Employee class
    String employeeID;
    String name;
    int baseSalary;

    // Constructor to initialize value
    Employee(String employeeID, String name, int baseSalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method
    abstract int calculateSalary();

    // Method to display details
    void displayDetail() {
        System.out.println("Employee id is: "+employeeID);
        System.out.println("Employee name is: "+name);
        System.out.println("Base salary of employee is: "+baseSalary);
    }
}
