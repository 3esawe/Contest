package HackkerRank;

import java.util.Scanner;

public class Subbarrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] Array = new int[n];
        for (int i = 0; i < Array.length; i++){
            Array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0 ; i < Array.length-1;i++){
            int sum = 0;
            for (int j = i; j < n;j++){
                sum= Array[j]+sum;
                if (sum < 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
