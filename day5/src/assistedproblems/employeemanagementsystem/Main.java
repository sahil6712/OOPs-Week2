package assistedproblems.employeemanagementsystem;

public class Main {
    public static void main(String[] args) {

        //Instance of Manager class
        Manager ramesh = new Manager("Ramesh","emp132",100000,7);
        ramesh.displayDetails();

        //Instance of Developer
        Developer sahil = new Developer("Sahil","emp927",99999999,"Java");
        sahil.displayDetails();

        //Instance of intern
        Intern assDas = new Intern("Assdas", "emp321", 19000, 1);
        assDas.displayDetails();
    }
}
