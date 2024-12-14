package Primitive.BooleanComparison;

public class Boolean1 {
    public static void main(String[] args) {


        //Create a code that will print true if a user cam vote.
        //User's age will be given as an int variable and age is 18 and up.

        int usersAge = 25;
        int ageToVote = 18;

      boolean canVote = usersAge >= ageToVote;
        System.out.println("Can user vote? --> " + canVote);




    }
}
