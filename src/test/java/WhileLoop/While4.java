package WhileLoop;

import java.util.Scanner;

public class While4 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double productPrice = 215.36;
        double userMoney = 0;

        while(userMoney < productPrice){
            System.out.println("Enter the $"+(productPrice - userMoney));
        }
    }


}
