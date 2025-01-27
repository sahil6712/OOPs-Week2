package singleinheritance.smarthomedevices;

public class Device {

    // Attributes of a Device class
    int deviceId;
    String status;

    // Constructor
    Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to show each device setting
    void displayStatus() {
        System.out.println("Status of device: ");
    }
}
