package ClassObjectMethod;

public class StaticExample {

    static String staticVariable;
    String nonStatic;


    public static void main(String[] args) {
        StaticExample firstObject = new StaticExample();
        StaticExample secondObject = new StaticExample();

        firstObject.nonStatic = "This is the valueassigned for the first object";
        System.out.println(firstObject.nonStatic);
        //how about the value for non stastic variable for the second

        System.out.println(secondObject.nonStatic);

    }
}
