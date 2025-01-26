package hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private int numberOfVisits;
    private List<String> medicalRecords;

    // Constructor
    public OutPatient(String patientId, String name, int age, double consultationFee, int numberOfVisits) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.numberOfVisits = numberOfVisits;
        this.medicalRecords = new ArrayList<>();
    }

    // Override calculateBill() to calculate out-patient bill
    @Override
    public double calculateBill() {
        return consultationFee * numberOfVisits;
    }

    // Implement addRecord() to add medical records for out-patient
    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
        System.out.println("Record added for " + getName());
    }

    // Implement viewRecords() to display all medical records
    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":");
        for (String record : medicalRecords) {
            System.out.println(record);
        }
    }
}

