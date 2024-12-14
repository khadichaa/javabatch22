package Absraction.HomeSystem;

public class SmartHome {
    public static void main(String[] args) {
        HomeThermostat thrmo = new HomeThermostat();
        thrmo.deviceStatus();
        SmartHomeDevice thrmo1 = new HomeThermostat();
        thrmo.turnOn();
        thrmo1.deviceStatus();
    }
}
