class Patient {
    // Static variable shared by all patients
    static String hospitalName;
    static int totalPatients = 0; 

    // Instance variables
    final String patientID; 
    String name;
    int age;
    String ailment;

    // Constructor
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++; 
    }

    // Static method to get total number of patients
    public static void getTotalPatients() {
        System.out.println("Total number of patients admitted: " + totalPatients);
    }

    // Method to display patient details
    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Hospital Name: " + hospitalName);
    }

    // Method to check if the object is an instance of Patient
    public void showPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            this.displayPatientDetails();
        } else {
            System.out.println("Error: The object is not a Patient instance.");
        }
    }

    // Static method to set the hospital name
    public static void setHospitalName(String name) {
        hospitalName = name;
    }

}

public class HospitalManagementSystem {

    public static void main(String[] args) {
        // Setting hospital name
        Patient.setHospitalName("City Hospital");

        // Creating patient objects
        Patient patient1 = new Patient("dinesh", 23, "Common Cold", "P343");
        Patient patient2 = new Patient("Jampa", 30, "Food poisioning", "P126");

        // Displaying patient details
        patient1.showPatientDetails(patient1);
        patient2.showPatientDetails(patient2);

        // Displaying total number of patients
        Patient.getTotalPatients();

        // Displaying details after adding another patient
        Patient patient3 = new Patient("Alice Brown", 29, "Cold", "P12347");
        patient3.showPatientDetails(patient3);

        // Displaying updated total patients count
        Patient.getTotalPatients();
    }
}
