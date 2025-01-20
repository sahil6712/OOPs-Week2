class Employee {
    private static String companyName = "IT Architects";

    private String name;
    private String designation;
    private final int id;

    static int numberOfEmployees = 0;

    // Constructor
    Employee(String name, String designation, int id) {
        this.name = name;
        this.designation = designation;
        this.id = id;
        numberOfEmployees++;  // for increasing the count for number of employees
    }


    // Method to return total numbers of Employees
    public static void displayTotalEmployees() {
        System.out.println("\nTotal number of employees are: "+numberOfEmployees);
    } 

    // Method to display employee details
    public void display() {
        System.out.println("\nCompany name: "+companyName);
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee designation: "+designation);
    }
}

public class EmployeeManagementSystem {
    public static void main(String args[]) {


        
        // Create object of Employe class
        Employee employee1 = new Employee("Sahil", "Manager", 123);
        if(employee1 instanceof Employee) {
            employee1.display();
        }

        Employee employee2 = new Employee("Akshat Tiwari", "SDE 2", 321);
        if(employee2 instanceof Employee) {
            employee2.display();
        }

        // Output total number of Emoloyee in a company
        Employee.displayTotalEmployees();
    }
}
