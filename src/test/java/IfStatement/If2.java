package IfStatement;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        /*
        Create a program that calculates the grade letter of a student.
        Ask user their grade as an integer number. Print 'Not valid grade if
        the grade is lower than 0 or bigger than 100.
        Print A+ if the grade is higher than 94
        Print A if the grade is in between 85 and 94 inclusive.
        Print B if the grade is in between 75 and 84 inclusive.
        Print C if the grade is in between 65 and 74 inclusive.
        print grade doesn't meet expectations when the grade is lower than 65/

         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade as an integer number ");
        int grade = scanner.nextInt();

        if (grade < 0 || grade > 100){
            System.out.println("Not a valid grade.");
        } else if (grade > 94){
            System.out.println("You got A+");
        } else if (grade >= 85 && grade <= 94 ) {
            System.out.println("You got A");
        } else if (grade >= 75 && grade <= 84) {
            System.out.println("You got B");
        } else if (grade >= 65 ) {
            System.out.println("You got C");
        }else {
            System.out.println("Grade doesn't meet expectations.");
        }
    }
}
