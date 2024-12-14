package ForLoop;

import java.util.Scanner;

public class ForLoop6 {
    public static void main(String[] args) {

        /*
        Ask user how many lines of output they would like ot see.
        1
        12
        123
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enterthe number of lines that you woudl like to see.");
        int lineNumber = scanner.nextInt();

        for (int currentLine = 1; currentLine <= lineNumber ; currentLine++) {
            //System.out.println( currentLine);
            //i need ot print numbers from 1 to current line number
            for (int numbersInLine = 1; numbersInLine <= currentLine; numbersInLine++){
                System.out.print(numbersInLine+ " ");
            }
            System.out.println();
        }

    }
}
