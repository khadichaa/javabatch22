package Primitive.BooleanComparison;

import java.util.Scanner;

public class Boolean5 {
    public static void main(String[] args) {

        /*
        We should create a program to calculate if there is
        still a ticket for the game tonight. We are given two variables:
        Capacity of the stadium and the amount of tickets sold.
         Print True if i can still buy a ticket, false otherwise.
         */


        Scanner scanner = new Scanner(System.in);

        //Ask user for the capacity of the stadium
        System.out.println("What is the capacity of the stadium?");
        int stadium = scanner.nextInt();

        //Learn the amount of tickets sold
        System.out.println("How many tickets were sold?");
        int ticketsSold = scanner.nextInt();

        //Solve
        boolean total = stadium > ticketsSold;
        System.out.println("Are there tickets left? -- " + total);



    }
}
