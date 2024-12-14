package HomeWork;

public class Task3Minutes {


    public static void main(String[] args) {

       int minInAYear = 60 * 24 * 365;
        int min = 3456789;

        int years = min / minInAYear;
        int days = min / 60 / 24 % 365;
        System.out.println("in " + min + " min there are " + years + " years " + " and " + days + " days");



    }


}
