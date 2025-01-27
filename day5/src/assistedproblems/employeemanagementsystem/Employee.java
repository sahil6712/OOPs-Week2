package assistedproblems.employeemanagementsystem;

abstract public class Employee {

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
