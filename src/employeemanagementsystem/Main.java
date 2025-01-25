package employeemanagementsystem;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ArrayList of employee
        ArrayList<Employee> employees = new ArrayList<>(2);

        // instance of full time employees
        FullTimeEmployee sahil = new FullTimeEmployee("emp123", "Sahil",100000,250000);
        sahil.assignDepartment("Development");

        // instance of part_time employee
        PartTimeEmployee rakul = new PartTimeEmployee("emp124","Rakul",90000,6);
        rakul.assignDepartment("Development");

        employees.add(sahil);
        employees.add(rakul);

        // showing details of employee
        for(Employee emp:employees){
            emp.displayDetail();
        }
    }
}
