package Firecode;

import java.util.Arrays;

public class mergeSortedArrays {
    public static void main(String[] args) {

    }
    public static int[] merge(int[] arrLeft, int[] arrRight){
        int [] newArray = new int[arrLeft.length + arrRight.length];
        int mid =0, left = 0, right =0;
        while (left < arrLeft.length && right < arrRight.length){
            newArray[mid++] = arrLeft[left] < arrRight[right] ? arrLeft[left++] : arrRight[right++];
        }
        while (left < arrLeft.length){
            newArray[mid ++] = arrLeft[left++];
        }
        while (right < arrRight.length){
            newArray[mid ++] = arrRight[right++];
        }
        return newArray;
    }
}
