package ForLoop;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ForLoop4_Practice {
    public static void main(String[] args) {

        /*
        Find out, if a given string is a palindrome.
        Palindrome means that reversed version of the string equals to a string itself
        Such as, Hannah, civic, anna
        Your code shouldn't be case-sensitive
        For loop and chat at method
         */

      /*
      1. We know how ot get each letter in the string one by one
      2. I need to reverse order in the step 1
      3. I need to find the sum of all characters that i print in step 2
         If we need to father(add) multiple chars in one data type, what data
      4. I need to compare reversed version of hte string ignoring the case
       */

        System.out.println("Enter a string ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String reverse = "";
        for (int i = str.length() -1 ; i >= 0; i--) {
            //System.out.println(str.charAt(i));
            reverse += str.charAt(i);
        }

        if (reverse.equalsIgnoreCase(str)){
            System.out.println("You have entered a palindrome string.");
        }else {
            System.out.println("That was not a palindrome string.");
        }
    }
}
