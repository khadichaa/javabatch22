package StringObject;

import java.util.Scanner;

public class Str4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name and borth year in a follwoing format: \nPortgas D Ace - 2003 ");
        String userIn = scanner.nextLine();
        boolean doesStart = userIn.startsWith("Ace");
        System.out.println("Does it start with my name? " + doesStart);
        boolean doesEnd = userIn.endsWith("2003");
        System.out.println("Does it ed with my birth year? " + doesEnd);

        boolean doesContain = userIn.contains("Ace");
        System.out.println("Does it contain my full name? " + doesContain);
    }
}
