package Primitive.ArithmeticOperators;

public class Ex2 {
    public static void main(String[] args) {

        /*
        In a zoo, there are 8 elephants, 12 tigers, 24 parrots.
        Each elephant eats 50 kg of food, each tiger eats 20kg, and each parrot eats 2kg of food daily.
        TASK: Calculate the total amount of food consumed by
        all animals in the zoo in one day, one month and one year.
         */

        int elephants = 8, tiger = 12, parrots = 24,
                elephantFood = 50, tigerFood = 20, parrotFood = 2;
        //int totalDay = 1, totalMonth = 31, totalYear = 365;

        int tigersDaily = tiger * tigerFood;
        int elephantsDaily = elephants * elephantFood;
        int parrotsDaily = parrots * parrotFood;

        int allAnimalsDaily = tigersDaily + elephantsDaily + parrotsDaily;
        System.out.println("All animals eat total of " + allAnimalsDaily + "kg daily.");

        int allAnimalsMonthly = 30 * allAnimalsDaily;
        int allAnimalsYearly = 365 * allAnimalsDaily;
        System.out.println("All animals eat "+allAnimalsMonthly + "kg a month" + " and they eat " + allAnimalsYearly +"kg a year.");












    }
}
