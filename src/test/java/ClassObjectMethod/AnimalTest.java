package ClassObjectMethod;

public class AnimalTest {
    public static void main(String[] args) {

        Animal monkey = new Animal();
        System.out.println(monkey.colors);
        System.out.println(monkey.age);
        System.out.println(monkey.numberOfLegs);

        //Instance variable(object attributes)(class variables)
        //take default value when they are unassigned
        //For every object -> null
        //for int, long -> 0
        //for double, float -> 0.0
        //for char = ''(empty char)
        //for boolean -> false
        //We coudl asssign values to insitiance variables.

        monkey.colors = "Brown";
        monkey.age = 5;
        monkey.numberOfLegs = 2;
        System.out.println(monkey.colors);
        System.out.println(monkey.age);
        System.out.println(monkey.numberOfLegs);


        Animal lion = new Animal();
        lion.colors = "Sand color";
        lion.age = 6;
        lion.numberOfLegs = 4;
        System.out.println(lion.colors);
        System.out.println(lion.age);
        System.out.println(lion.numberOfLegs);


        //Calling a method for an object .
         lion.sleep();

         lion.move(4);
         lion.move(9);

    }

    //Let's create s move that will tak enumver of moves as an int parameter
    //for every more animal will lose 10 points of energy
    //print out whever animal is able to move
    //if so , print out hte level energy left



}
