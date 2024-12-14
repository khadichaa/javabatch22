package ScannerUsage;


import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {

        /*
        Scanner is a class in Java that provides methods for reading input if user from console.
        In order ot use scanner class we will create a scanner object, and then using the scanner object
        we will ask the user to enter specific values.
        We have to explicitly call a method that matches with data type that we expect from user.
         */


        Scanner chan = new Scanner(System.in);
        System.out.println("Type your age");
        int age = chan.nextInt();
        System.out.println("User's age is -> " + age);

        System.out.println("---------------------------");
        System.out.println("Enter a decimal number");
       double d1 = chan.nextDouble();
        System.out.println("Your decimal number is " + d1);

        System.out.println("---------------------------");
        System.out.println("Enter your name");
        String name = chan.next();
        System.out.println("Your name is " + name);







    }
}
