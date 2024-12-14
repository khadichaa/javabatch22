package Absraction.HomeSystem;

public class HomeThermostat  implements SmartHomeDevice{

    private boolean isOn;
    private int currentThermostat;


    public HomeThermostat(){
        this.isOn = false;
        this.currentThermostat = 70;
    }


    @Override
    public void turnOn(){
        isOn = true;
        System.out.println("Thermostst is ON");
    }

    @Override
    public void turnOff(){
        isOn = false;
        System.out.println("Thermostat is OFF");
    }

    @Override
    public void deviceStatus(){
        if (isOn){
            System.out.println("Thermostst is ON");
        }else {
            System.out.println("Thermostat is OFF");
        }
    }
}
