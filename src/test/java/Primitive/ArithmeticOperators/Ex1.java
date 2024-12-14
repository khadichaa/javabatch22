package Primitive.ArithmeticOperators;

public class Ex1 {
    public static void main(String[] args) {

        /*
        In a farm we have 20 cows, 48 ducks, 14 cats
        calculate the total number of legs in the farm and display the result.
         */


        int cows = 20, ducks = 48, cats = 14;
        int fourLegged = 4, twoLegged = 2;
        int totalOfLegs = cows * fourLegged + ducks * twoLegged + cats * fourLegged;
        System.out.println("Total of legs in the farm --> " + totalOfLegs);













    }
}
