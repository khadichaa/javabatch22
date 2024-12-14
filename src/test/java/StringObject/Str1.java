package StringObject;

import java.util.Scanner;

public class Str1 {
    public static void main(String[] args) {

        /*
        Ask user to input a string
        anf from the input find th etotal number of characters in a given string.
        IF there is more than 10 characters in a given string calcualte and print
        the last index in the string
        If there is 10 or less characters in a string, then print nothing to calculate
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter a string... ");
        String str1 = scanner.nextLine();

        int length = str1.length();
        if (length > 10){
          int lastIndexOFStr1 = length -1;
            System.out.println("Last index of str1 is " + lastIndexOFStr1);
        }else {
            System.out.println("Nothing to calculate...");
        }






    }
}
