package employeemanagementsystem;

class FullTimeEmployee extends Employee implements Department {

    private String department;
    private final int additionalPay;

    FullTimeEmployee(String employeeId, String name, int baseSalary, int additionalPay) {
        super(employeeId, name, baseSalary);
        this.additionalPay = additionalPay;
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
        int totalSalary = super.baseSalary + additionalPay;
        System.out.println("Salary of "+name+" is: "+totalSalary);
        return totalSalary;
    }

    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("Department of employee is: "+department);
        System.out.println("Total Salary of "+name+" is: "+baseSalary+additionalPay+"\n");
    }
}
