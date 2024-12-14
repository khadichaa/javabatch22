package Primitive.BooleanComparison;

import java.util.Scanner;

public class Boolean8 {
    public static void main(String[] args) {


        /*
       Multiple of 3 and 5
       Write a program that takes a number as input and prints
       true of the number is a multiple of both three and five, false otherwise.

         */



            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number in the next line. ");
            int number = scanner.nextInt();

            boolean isDivisible = number % 3 == 0 && number % 5 == 0;

            System.out.println("Is the number divisible by both 3 and 5 -> " + isDivisible);

    }
}
