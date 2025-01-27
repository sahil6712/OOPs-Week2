package assistedproblems.employeemanagementsystem;

class Intern extends  Employee {
    private final int internshipDuration;

    // Constructor
    Intern(String name, String empId, int salary, int internshipDuration) {
        super(name, empId, salary);
        this.internshipDuration = internshipDuration;
    }

    @Override
    void displayDetails() {
        System.out.println("Name of Intern is: "+name);
        System.out.println("Temporary Employee id of Intern is: "+empId);
        System.out.println("Salary of Manager is: "+salary);
        System.out.println("Internship duration in months: "+internshipDuration+"\n");
    }
}
