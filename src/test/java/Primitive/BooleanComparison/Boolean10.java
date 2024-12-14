package Primitive.BooleanComparison;

import java.util.Scanner;

public class Boolean10 {
    public static void main(String[] args) {
        /*
        Leap Year ( if the year has 366 days)
        A year is a leap if it is divisible by 4 not by 100
        unless it is also divisible by 400.
        Write a program that take a year as input
        and prints True if it is a leap year, false otherwise
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year ");
        int year = scanner.nextInt();

        boolean isLeapYear = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
        System.out.println("Given year is a leap year 202" + isLeapYear);

    }
}
