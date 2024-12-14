package Arrays;

import java.util.Arrays;

public class Array1_Intro {
    public static void main(String[] args) {
        //syntax for creation


        /*
         We created an array that holds 4 elements in it.
        Since we have not yet initialized each element's value, they will take the default values.
        All numeric types: -> 0 or 0.0
        char -> empty char
        For every other thing it is going to be null
        How could we see what is inside the array?

         */

        double[] num = new double[4];
        System.out.println(num); //location of the array in memory

        System.out.println(Arrays.toString(num));
        String[] txt = new String[2];
        System.out.println(Arrays.toString(txt));


        //How could we access the individual elements from an array

        int[] nums = new int[]{1, 2, 3, 4, 5};
        System.out.println("First element from array nums -> " + nums[0]);
        System.out.println("Second element from array nums -> " + nums[2]);
        //This is how you print out an individual element^


        //ArrayIndexOutOfBounds Exception
        //System.out.println("10th element from an array -> " + nums[10]);


        //How to learn the size of the array?
        //To learn the size of an array we could use length variable of array

        System.out.println("The size of an array in nums is " + nums.length);

        //Find ht elast index of array nums?

        System.out.println("Last index of array nums "+ (nums.length-1));

        //We could individually reassign elements of they array.

        nums = new int[]{1, 2, 3, 4, 5};
        nums[0] = 100;
        System.out.println(Arrays.toString(nums));


        //multiply the 5 value of fourth element in the array

        //value of the 4th element is entered 5 times less than it should be
        nums[3] *= 5;
        System.out.println(Arrays.toString(nums));



    }
}
