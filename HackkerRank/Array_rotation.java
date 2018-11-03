package HackkerRank;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;

public class Array_rotation {
    public static void main(String[] args) {


        //5 1 2 3 4
        int x[] = {1,2,3,4,5};
        x = arrayRotation(x,4);
        System.out.println(Arrays.toString(x));
    }

    public static int[] arrayRotation(int [] x, int shift){
        int [] returned = new int[5];
        for (int i = 0 ; i < x.length    ; i++){

            returned[  (i+(x.length-shift)) % x.length ] = x[i];
        }
        return returned;
    }
}
