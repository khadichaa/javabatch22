package Primitive.BooleanComparison;

import java.util.Scanner;

public class Boolean9 {
    public static void main(String[] args) {
        /*
        John want ot lose 10 pounds in one month.
        There are multiple conditions to lose 10 pounds in a month.
        John needs to walk 10000 steps daily OR needs to run at
        least 4 miles a day. and Addition to these,  john needs to
        eat less than 1500 calories daily. We should create a
        program to calculate if john can lose weight or not
        daily steps, running distance and daily caloric intake
        will be given by user. Our goal is to print True when
        John can lose weight and print False otherwise.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the daily caloric intake. ");
        int dailyIntake = scanner.nextInt();

        System.out.println("Enter the daily running distance. ");
        int runningDistance = scanner.nextInt();

        System.out.println("Enter the the daily steps that you have completed. ");
        int stepsDaily = scanner.nextInt();

        boolean isMovement = stepsDaily >= 10000 || runningDistance >= 4;
        boolean isDiet = dailyIntake < 1500;

        boolean canLose = isMovement && isDiet;
        //another easier version
        //boolean canLose = (stepsDaily >= 10000 || runningDistance >= 4) && dailyIntake < 1500;
        System.out.println("Can lose the 10 pound? " + canLose);
        


    }
}
