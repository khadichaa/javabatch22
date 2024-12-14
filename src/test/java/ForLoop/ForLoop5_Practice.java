package ForLoop;

import java.util.Scanner;

public class ForLoop5_Practice {
    public static void main(String[] args) {

        /*
        Ask the user to enter an integer number and print if the given number is a prime number.
        Prime number can be divided by one and itself.
        Every number can be divided by one and itself,
        The distinct feature of prime numbers is that they can't be divided by any other number.

         */

        Scanner scanner = new Scanner(System. in);
        System.out.println("Enter an integer number...");
        int num = scanner.nextInt();

        /*
        1. I have to look through all the possible divisors of a number.
        2. What is the range of possible divisors for a number?
           Possible divisor of a number should be smaller than or equal
           to number itself and bigger than equal to number 1
           Range for a possible divisor of a number -> 1 <= possibleDivisor <= number
        3. Since I am looking for a prime number which can be divided by 1 and itself
           I could reduce my range to 1 < possibleDivisors < number
         */
           boolean isPrime = true;
        for (int possibleDiv = 2; possibleDiv < num; possibleDiv++) {

            //How to check the current possibleDiv divides the number perfectly?
            if (num % possibleDiv == 0){
                isPrime = false;
                //It means that number can be divided by a possibleDiv
                //so it is not a prime number.
                //Do i need to continue the loop?
                System.out.println(num + " Is not a prime number. ");
                break;
            }
        }

        if (isPrime){
            System.out.println(num + " Is a prime number. ");
        }

    }
}
