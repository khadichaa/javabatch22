package Primitive;

public class IntegerLongType {

    public static void main(String[] args) {

        /*
        Integer and Long
        ...-1, -2, 0, 1, 2....

        By default java users integer type for non-decimal numbers.
        Therefore, when we assign an integer value to long type we have to use l at the end of the value.

        Long is a larger data type than integer. Integer is 31, long is 64 bit.
         */

        //Int variable

        int numberOfComputers = 41;
        System.out.println(numberOfComputers);

        /*int avarageGrade = 5.6;
        System.out.println(avarageGrade);
        the variable creation above won't work because decimal numbers CANNOT be assigned to in or long data type,
         */

        long numberOfVariables = 90000;
        System.out.println(numberOfVariables);

        /*
        The main difference between long and integer is amount of memory they use.
        Long use about 64 bit of a memory while integer is using 32 bit.
        Long is the larger data type of the two, long can store larger values.
         */

        System.out.println("Max Value for Integer " + Integer.MAX_VALUE);
        System.out.println("Max Value for Long " + Long.MAX_VALUE);












    }
}
