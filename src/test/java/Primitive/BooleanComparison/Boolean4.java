package Primitive.BooleanComparison;

import java.util.Scanner;

public class Boolean4 {

    public static void main(String[] args) {

        /*
        Create a program that asks user to enter their exam results.
        Find the avarage of 3 exam results with decimal points.
        Passing grade for exam is 75. If user passes print true anf if they fail print false
         */

        Scanner chan = new Scanner(System.in);
        System.out.println("Enter your 1st exam results ");
        int ex1 = chan.nextInt();
        System.out.println("Enter your 2nd exam results ");
        int ex2 = chan.nextInt();
        System.out.println("Enter your 3rd exam results ");
        int ex3 = chan.nextInt();

        double avg = (ex1 + ex2 + ex3) / 3.0;
        System.out.println(avg);











    }



}
