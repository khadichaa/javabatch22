package Arrays;

public class Array5_Practice {
    public static void main(String[] args) {

        String[] words = {"What", "a", "lovely", "day", "right?"};

        //Write a program that counts how many times the letter 'e' appeared across all string in the array.
        //hint: Use a nested loop. First loop for each string in the array, and inner loop o check each char in a string


        int countOfE = 0;
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            for (int j = 0; j < currentWord.length(); j++) {
             if (currentWord.charAt(j) == 'e'){
                 countOfE++;
             }
            }
        }
        System.out.println("Total number of 'e' in this array is " + countOfE);
    }
}
