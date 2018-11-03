package HackkerRank;

import java.util.Arrays;

public class SwappingArray {
    public static void main(String[] args) {
        int [ ]x = {1 ,10 ,3 ,4 ,3};
        System.out.println(swapToSort(x));
    }

    static int swapToSort(int[] a) {
        // Return -1 or 0 or 1 as described in the problem statement.
        int [ ]b = Arrays.copyOf(a,a.length);
        Arrays.sort(a);
        int counter= 0;
        for (int i=0;i < b.length;i++){
            if (a[i] != b[i]){
                counter++;
            }
        }
        if (counter == 2)return 1;
        else if (counter == 0) return 0;
        else return -1;

    }
}
