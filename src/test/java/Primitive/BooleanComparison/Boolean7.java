package Primitive.BooleanComparison;

import java.util.Scanner;

public class Boolean7 {
    public static void main(String[] args) {

        /*
        Company wants to increase hteir server to
        their CPU usage. Create a java program that gets avarage cpu usage
        as an input and prints true if we need to launch more servers for our applications.
        When avarage cpu usage is between 40 and 70 inclusive
        we should launch a new server.
         */
        Scanner scanner = new Scanner(System.in);
        int CPUUsage = scanner.nextInt();

        //i want spu usage to be higher or equal ro 40 and less than or equal 70.

        boolean shouldLaunch = CPUUsage >= 40 && CPUUsage <= 70;

        System.out.println(shouldLaunch);
    }
}
