package StringObject;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Str3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password with both upper and lower case characters.");
        String pass = scanner.nextLine();


        String lower = pass.toLowerCase();
        boolean isAllLower = pass.equals(lower);
        String upper = pass.toUpperCase();

        boolean isAllUpper = pass.equals(upper);


        if (isAllLower){
            System.out.println("Invalid response all lower case");
        }else if (isAllUpper){
            System.out.println("Invalid response all upper case");
        }else {
            System.out.println("Valid password!");
        }
    }

}
