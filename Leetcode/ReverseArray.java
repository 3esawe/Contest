package Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] x = {1,2,3,4,5};
        Reversearray(x,0,x.length - 1);
        System.out.println(Arrays.toString(x));
    }

    public static void Reversearray(int[] x, int lo, int hi){
        if (lo < hi){
            int temp = x[lo];
            x[lo] = x[hi];
            x[hi] = temp;
            Reversearray(x, lo+1, hi-1);
        }
    }
}
