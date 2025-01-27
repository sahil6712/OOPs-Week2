package singleinheritance.smarthomedevices;

public class Thermostat extends Device{
    private final float temperatureSetting;

    // Constructor
    Thermostat(int deviceId, String status, float temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("DeviceId: "+deviceId);
        System.out.println("Status of device: "+status);
        System.out.println("Temperature Settings: "+temperatureSetting);
    }

}
