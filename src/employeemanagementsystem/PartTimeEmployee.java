package employeemanagementsystem;

class PartTimeEmployee extends Employee implements Department {

    private String department;
    private int workingHours;
    private final int hourlyCharge = 1000;

    PartTimeEmployee(String employeeId, String name, int baseSalary, int workingHours) {
        super(employeeId, name, baseSalary);
        workingHours = this.workingHours;
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public int  calculateSalary() {
        int totalSalary = baseSalary+(workingHours*hourlyCharge);
        return totalSalary;
    }

    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("Department of employee is: "+department);
        System.out.println("Total Salary of "+name+" is: "+baseSalary+(hourlyCharge*workingHours)+"\n");
    }
}
