package hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

class InPatient extends Patient implements MedicalRecord {
    private double dailyCharge;
    private int daysAdmitted;
    private List<String> medicalRecords;

    // Constructor
    public InPatient(String patientId, String name, int age, double dailyCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.daysAdmitted = daysAdmitted;
        this.medicalRecords = new ArrayList<>();
    }

    // Override calculateBill() to calculate in-patient bill
    @Override
    public double calculateBill() {
        return dailyCharge * daysAdmitted;
    }

    // Implement addRecord() to add medical records for in-patient
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
