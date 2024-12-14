package IfStatement;

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        /*
        Speed limit on highway is 70 and 45 on other roads.
        When user exceeds the speed over 10 miles an hour
        they get ticket, when they exceed the speed limit
        over 25 miles an hour they get their license withdrawn.

        Ask user their speed and which road are they going.
        And print whether they get ticket or other form of punishments.
        If they are going less than or equal to speed limit,
        print you are driving safe, if they are driving over the
        speed limit but not high enough to get a ticket, then they
        will get a warning.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter true if you were on highway, enter false otherwise ");
        boolean highway = scanner.nextBoolean();

        System.out.println("What was your speed? ");
        int userSpeed = scanner.nextInt();

        if (highway) {
            int speedLim = 70;
            if (userSpeed <= speedLim) {
                System.out.println("You are driving safe!");
            } else if (userSpeed > (speedLim + 25)) {
                System.out.println("Your license will be revoked.");
            } else if (userSpeed >= speedLim + 10 && userSpeed <= speedLim + 25) {
                System.out.println("You will get a ticket!");

            } else {
                System.out.println("You will get a warning.");
            }
        } else {
            int speedLim = 45;
            if (userSpeed <= speedLim) {
                System.out.println("You are driving safe!");
            } else if (userSpeed > (speedLim + 25)) {
                System.out.println("Your license will be revoked.");
            } else if (userSpeed >= speedLim + 10 && userSpeed <= speedLim + 25) {
                System.out.println("You will get a ticket!");

            } else {
                System.out.println("You will get a warning.");
            }
        }



    }
}
