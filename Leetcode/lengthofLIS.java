package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class lengthofLIS {
    public static void main(String[] args) {
        int [] x= {3, 10, 2, 1, 20};
        System.out.println(LongestIncreasingSubsequenc(x));
    }

    public static int LongestIncreasingSubsequenc (int [] array){
        if (array.length == 0 ) return 0;
        int [] l = new int[array.length];
        for (int i = 0 ; i < l.length; i++){
            l[i] = 1;
        }
        for (int i = 1; i < array.length; i++){
            for (int j = 0; j < i;j++){
                if ((array[j] < array[i])){
                    l[i] = Math.max(l[i], l[j] +1);
                }
            }
        }
        int max = 0;
        for (int i = 0 ; i < l.length; i++){
            if (max < l[i]){
                max = l[i];
            }
        }
        return max;
    }
}
