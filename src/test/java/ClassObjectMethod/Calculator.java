package ClassObjectMethod;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public double findSum(double num1, double num2){
        return num1 + num2;
    }

    public int square(int num){
        return num*num;
    }


    public int findSum(List<Integer> numss){
        int sum = 0;
        for (int element : numss){
            sum+=element;
        }return sum;
    }

    public String isWeekend(boolean b){
        if (b){
            return "It is awake";
        }return "IT is still asleep";
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 11.5;
        double b = 0.5;
        double sum = calculator.findSum(a, b);
        System.out.println(sum);

        System.out.println(calculator.square(4));

        System.out.println(calculator.findSum(3.6,2.8));
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(54);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);
        System.out.println(calculator.findSum(numbers));



        String test = "Doesn't matter";
        test.substring(2);
        test.substring(4, 6);

        test.replace("o", "t");
        test.replace("doesn't", "do");



    }
}
