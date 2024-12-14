package Primitive.BooleanComparison;

import java.util.Scanner;

public class Boolean3 {


//Problem: Even or Odd
// We will write a program that prints True when variable
//`number` is  even, and prints False when the number is odd.
//Odd num: 1,3,5,7,9,11,13 etc.
//Even num: 2,4,6,8,10,12 etc.


    public static void main(String[] args) {

        Scanner chan = new Scanner(System.in);

        System.out.println("Enter a whole number ");
        int num = chan.nextInt();

        int remainderWith2 = num % 2;
        boolean isEven = remainderWith2 == 0;

        System.out.println("Is the given number even? -> " + isEven);









    }
}
