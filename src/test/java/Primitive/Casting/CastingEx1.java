package Primitive.Casting;

public class CastingEx1 {
    public static void main(String[] args) {

        //implicit casting happens small data type to higher data type
        float f = 41;
        //What is the data type of variable? Float

        int num = (int)f;
        /*
        The variable f is explicitly cast to integer type.
        Explicit casting used when converting larger data type to smaller data type
         */

        System.out.println("The variable f is --> " + f);
        System.out.println("The variable num is  --> " + num);

        /*
        Casting from decimal to a whole number will always
        get rid of all the decimal part. No rounding will happen.
         */

        double d1 = 56.76;
        byte b = (byte)d1;
        System.out.println("Double variable with value 56.76 casted to byte --> " + b);
        //IT will get rid of the 76 and end up being 56

    }
}
