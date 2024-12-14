package StringObject;

import java.util.Scanner;

public class Str5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String firstwo = str.substring(0, 2);
        String restOfWord = str.substring(2);
        String rotated = restOfWord.concat(firstwo);
        System.out.println("Rotated version of this string is " + rotated);
    }
}
