package Arrays;

public class Arrays6_Practice {
    public static void main(String[] args) {

        int[] numbers = {12, 16, 15, 18, 14, 9, 21, 7};
        /*
        found out pairs of numbers from given array if they make 30 as total
         */




        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == 30){
                    System.out.println(numbers[i] + " + " + numbers[j] + " = 30");
                }
            }
        }





    }
}
