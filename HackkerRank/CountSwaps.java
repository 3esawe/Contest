package HackkerRank;

public class CountSwaps {
    public static void main(String[] args) {
        int [] x = {3,2,1};
        countSwaps(x);
    }
    static void countSwaps(int[] a) {


        int swaps = 0;
        boolean isSorted = false;
        int sizeOfArr = a.length;
        int lastUnsorted = sizeOfArr - 1;

        while(!isSorted){
            isSorted = true;
            for(int n = 0; n < lastUnsorted; n++){
                if(a[n] > a[n+1]){
                    swaps++;
                    int temp = a[n];
                    a[n] = a[n+1];
                    a[n+1] = temp;
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }

        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[sizeOfArr-1]);



    }
}
