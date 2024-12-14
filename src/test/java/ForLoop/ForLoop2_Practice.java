package ForLoop;

public class ForLoop2_Practice {
    public static void main(String[] args) {

        /*
        Find the sum of numbers between 1 and 20 inclusive.
        Find the sum of odd number between 10 and 100.
         */

        int sum = 0;
        for (int i = 1; i <= 20; i++){
           // System.out.println(i);
            sum += i;

        }
        System.out.println(sum);


        int sumOdd = 0;
        for (int num = 11; num < 100; num+=2){
            sumOdd += num;
        }
        System.out.println(sumOdd);


    }
}
