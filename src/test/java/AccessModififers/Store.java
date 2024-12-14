package AccessModififers;

public class Store {


 public static String companyName = "Camellia Garden";
 private String storeSecretCode;

 String storeLocation;


 public Store(String storeSecretCode, String storeLocation){
     this.storeSecretCode = storeSecretCode;
     this.storeLocation = storeLocation;
 }

 public void displayDetails(){
     System.out.println("Store Location " + storeLocation);
     System.out.println("Store Secret Code " + storeSecretCode);
 }

 void updateSecretCode(String newCode){
     this.storeSecretCode =newCode;
 }

    public static void displayCompanyName(){
        System.out.println("Company Name: " + companyName);
    }




}
