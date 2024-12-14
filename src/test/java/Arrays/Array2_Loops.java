package Arrays;

import java.util.Arrays;

public class Array2_Loops {
    public static void main(String[] args) {

        int[] zipCodes = new int[4];
        zipCodes[0] = 56743;
        zipCodes[1] = 50235;
        zipCodes[2] = 52358;
        zipCodes[3] = 52046;
        System.out.println(Arrays.toString(zipCodes));


        //let's print only even zip codes from an array

        for (int index = 0; index < zipCodes.length; index++){
            int currentZip = zipCodes[index];
            if (currentZip % 2 ==0){
                System.out.println(currentZip);
            }
        }



    }
}
