package WhileLoop;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isUnexpectedNum = true;
        while (isUnexpectedNum){
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            isUnexpectedNum = number < 1000 || number > 2000;
        }
        System.out.println("You entered the number in expected range");


    }
}
