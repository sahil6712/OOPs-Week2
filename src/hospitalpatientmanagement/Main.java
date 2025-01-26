package hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create different patient objects
        Patient inPatient = new InPatient("P001", "John Doe", 45, 300, 10);
        Patient outPatient = new OutPatient("P002", "Jane Smith", 32, 100, 5);

        // List to store patient objects
        List<Patient> patients = new ArrayList<>();
        patients.add(inPatient);
        patients.add(outPatient);

        // Display details and calculate bills for all patients
        System.out.println("Hospital Patient Management System\n");
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: $" + patient.calculateBill() + "\n");
        }

        // Handle medical records for InPatient and OutPatient
        System.out.println("Managing Medical Records:\n");

        // Cast to MedicalRecord to add and view records
        if (inPatient instanceof MedicalRecord) {
            MedicalRecord inPatientRecord = (MedicalRecord) inPatient;
            inPatientRecord.addRecord("Surgery - Knee Replacement");
            inPatientRecord.addRecord("Blood Pressure Check");
            inPatientRecord.viewRecords();
        }

        if (outPatient instanceof MedicalRecord) {
            MedicalRecord outPatientRecord = (MedicalRecord) outPatient;
            outPatientRecord.addRecord("Consultation - Dermatology");
            outPatientRecord.addRecord("Blood Test - Routine");
            outPatientRecord.viewRecords();
        }
    }
}
