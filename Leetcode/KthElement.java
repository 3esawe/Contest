package Leetcode;

public class KthElement {
    public static void main(String[] args) {

    }

    public static int kth(int array1 [], int array2 [], int kth){
        int sorted [] = new int[array1.length + array2.length];
        int i = 0, j =0, k =0;
        while (i < array1.length && j < array2.length){
            sorted[k++] = array1[i] < array2[j] ? array1[i++] : array2[j++];
        }
        while (i < array1.length){
            sorted[k++] = array1[i++];
        }

        while (j < array2.length){
            sorted[k++] = array2[j++];
        }

        return sorted[kth];
    } // assueme two arrays are sorted
}
