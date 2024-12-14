package ClassObjectMethod;

public class Animal {
    String colors;
    int age;
    int numberOfLegs;
    int energyLevel;




    /*
    Methods
    Methods in class are used to show which action the object out of this class can take.
    It defines the behaviour of the object.

To create a method

1. access modifier (For now we'll be using public only) accessible everywhere
2. Return type (If you want ot return a specific values you could, if not don't)
3. NAme of the method
4. necessary parameters(values) tghat the method neees
5, define the block of ht emethod wiht cruly braces
     */


  public void sleep() {
      System.out.println("Now the animals is sleeping");
      energyLevel = 100;
      System.out.println("The energy level is " + energyLevel);

    }

    public void move (int numberOfMoves){
        int maxMov = energyLevel/10;
        if (numberOfMoves > maxMov){
            System.out.println("Animal cannot complete this number of m moves.");
            System.out.println("Animal can perform maximum " + maxMov);
        } else if (numberOfMoves <= maxMov) {
            energyLevel = energyLevel - (numberOfMoves * 10);
            System.out.println("Animal will complete this move and left energy is " + energyLevel);
        }
    }

}
