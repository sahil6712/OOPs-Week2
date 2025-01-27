package assistedproblems.employeemanagementsystem;

public class Manager extends Employee {
    //Employee class attribute
    private final int teamSize;

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
