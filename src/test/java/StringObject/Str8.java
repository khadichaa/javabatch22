package StringObject;

import java.util.Scanner;

public class Str8 {
    public static void main(String[] args) {

        /*
        Given two strings, append them together (known as "concatenation")
        And return the result. However, if the strings are different lengths,
        omit starting chars from the longer string so it is the same length as the
        shorter string. So "Hello" and "Hi"  yield "loHi"
        The strings may be any length
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String str1 = scanner.nextLine();
        System.out.println("Enter another string");
        String str2 = scanner.nextLine();

        //str1 + str2, longer string is not known by us

        /*

        1. Two strings can be same length
        2. str1 could be longer than str2
        3. str2 could be longer than str1

         */


        
    }
}
