package assistedproblems.employeemanagementsystem;

class Developer extends Employee {
    private final String programmingLanguage;

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
