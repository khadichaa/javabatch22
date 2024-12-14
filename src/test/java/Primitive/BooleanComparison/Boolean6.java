package Primitive.BooleanComparison;

import java.util.Scanner;

public class Boolean6 {
    public static void main(String[] args) {

        /*
        A sports shop offers a buy-one-get-one-half-off deal. The user inputs
        the price of the first item and the price of the second item. The goal is to calculate the
        total cost under the deal and determine if the total cost exceeds $50

        take two inputs for the item price and calculate the total and apply the discount
        on the second item (half off which is 50-50)
        Print if the cost was below 50$, otherwise print false
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price of the first item.");
        double item1 = scanner.nextDouble();

        System.out.println("Enter the price of the second item.");
        double item2 = scanner.nextDouble();

        double total = item1 + item2 / 2;
        boolean total2 = total < 50;

        System.out.println("Is the cost less than 50?   "+total2);


    }
}
