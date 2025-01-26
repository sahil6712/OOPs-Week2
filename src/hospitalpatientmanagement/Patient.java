package hospitalpatientmanagement;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters for encapsulation
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method to calculate bill, implemented by subclasses
    public abstract double calculateBill();

    // Concrete method to get patient details
    public String getPatientDetails() {
        return "Patient ID: " + patientId + "\nName: " + name + "\nAge: " + age;
    }
}
