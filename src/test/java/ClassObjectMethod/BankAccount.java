package ClassObjectMethod;

public class BankAccount {
    String userName, password, bankName = "TestBank";
    double balance;
    boolean isLoggedIn;






    public void displayInfoMethod(){

        if (isLoggedIn){
            System.out.println("User Name: " + userName);
            System.out.println("Password: " + password);
            System.out.println("Bank Name: " + bankName);
            System.out.println("Balance: " +  balance);
        }



    }
    public boolean logIn(String uName, String pass) {
        if (uName.equals(userName) && pass.equals(password)) {
            System.out.println("You have logged in!");
            isLoggedIn = true;
            return isLoggedIn;
        }
        System.out.println("You cannot log in, wrong credentials.");
     isLoggedIn = false;
        return isLoggedIn;
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.userName = "test";
        bank.password = "tasty";

        bank.displayInfoMethod();
        /*
        Since isLoggedIn value has not been assigned yet.
        IT will take the default value for boolean which is false.
        In the disaply info we have an if statement if isLoggedIn value is true. it will dispaly all the information
        if isLoggedIn value is false it won't dispaly anything
        the calling of method above wont display anything


        to display information we must log in to out account
        //call log in mehtod

         */



        bank.logIn("test", "tasty");


    }


}
