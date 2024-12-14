package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays4_Practice {
    public static void main(String[] args) {

        /*
        Ask user how many numbers they want to enter.
        Ask them to enter each value individually.
        Store all the value that user entered, in an array
        Find sum of all the values from the array,
        and find the avarage of the values in an array
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an amount of numbers that you will give: ");
        int sizeOfTheNumbers = scanner.nextInt();
        int[] givenNum = new int[sizeOfTheNumbers];
        int orderNum = 1;

        while(orderNum <= sizeOfTheNumbers){
            System.out.println("Please enter the number " + orderNum);
            int input = scanner.nextInt();
            givenNum[orderNum-1] = input;
            orderNum++;
        }
        System.out.println(Arrays.toString(givenNum));

        int sum = 0;
        for (int i = 0; i < givenNum.length; i++) {
            sum += givenNum[i];
        }
        System.out.println("Sum of all numbers in the array is " + sum);


        //to fidn an avarage we will divide sum of numbers to length of numbers.
        double avarage = sum/givenNum.length;
        System.out.println(avarage);




    }
}
