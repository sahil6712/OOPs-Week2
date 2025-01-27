package singleinheritance.smarthomedevices;

public class Main {
    public static void main(String[] args) {

        // Instance of the Thermostat
        Thermostat tms = new Thermostat(12,"Working",23.3f);

        // Display status
        tms.displayStatus();
    }
}
