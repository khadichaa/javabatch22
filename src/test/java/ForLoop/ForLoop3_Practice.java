package ForLoop;


public class ForLoop3_Practice {
    public static void main(String[] args) {


        String str = "Java is getting very easy to work with. ";
        /*
        Print the count of letter 't' from the string

        1. I would check each letter in a string
        2. Every time I encounter letter 't', I would increase the count of letter 't'
        3. To store the count of letter I would create a variable
        4. To check each letter in a sting I would use loop
         */


        int countLetterT = 0;
        for ( int i = 0; i < str.length(); i++){
           char currentChar =  str.charAt(i);
           if (currentChar == 't'){
               countLetterT ++;
           }
        }
        System.out.println("Count of letter t in the string is " + countLetterT + ".");


    }
}
