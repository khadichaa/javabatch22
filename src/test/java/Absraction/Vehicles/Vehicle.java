package Absraction.Vehicles;

public abstract class Vehicle {

    private String registrationNumber;
    private String brand;


    public Vehicle (String registrationNumber, String brand){
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }


    public abstract void start();

    public void stop(){
        System.out.println(brand + " vehicles with registration " + registrationNumber + " is stopping");
    }


    public String getRegistrationNumber(){return registrationNumber;}
public String getBrand(){return brand;}
    public void getRegistrationNumber(String registrationNumber){this.registrationNumber = registrationNumber;}

}
