package Arrays;

public class Array3_Practice {
    public static void main(String[] args) {

        int[] numbers = {4, 2, 55, 90, 304, 41, -30};

        //Display largest and smallest value from the given array.
        //This value are going to be from the array

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 0; i < numbers.length; i++){

            if (largest < numbers[i]){
                largest = numbers[i];
            }

            if (smallest > numbers[i]){
                smallest = numbers[i];
            }

        }

        System.out.println("Latgets value in the array is " + largest);
        System.out.println("The smallest number in the array is " + smallest);





    }
}
