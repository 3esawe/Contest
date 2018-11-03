package HackkerRank;

import java.util.Arrays;

public class two_sum {
    public static void main(String[] args) {
        int [] a = {2,7,11,15};
        int [] x = twoSum(a,9);
        System.out.println(Arrays.toString(x));

    }
    public static int[] twoSum(int[] A, int target) {
        int [] ret= new int[2];
        for (int i = 0 ; i <A.length; i++){
            for (int j = i +1 ; j < A.length; j++){
                if (A[i] + A[j] == target){
                    ret = new int[]{j,i};
                    return ret;
                }

            }
        }
        return null;
    }
}
