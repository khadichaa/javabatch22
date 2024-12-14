package IfStatement;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        /*
        Ask user to enter two equal integer vriables, if user enters
        two numvers that are same we will print
        'You've eneterd two equal numbers'. If user enters two different numbers,
         we will print 'You didn't follow the instructions'
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers that are equal to each other. ");
        System.out.println("Enter a number ");
        int num1 = scanner.nextInt();
        System.out.println("Enter another number ");
        int num2 = scanner.nextInt();

        if (num1 != num2){
            System.out.println("You didn't follow the instructions-");
        }else {
            System.out.println("You've entered two equal numbers!");
        }

    }
}
