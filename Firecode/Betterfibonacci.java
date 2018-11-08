package Firecode;

import java.util.LinkedList;
import java.util.List;

public class Betterfibonacci {
    public static void main(String[] args) {
        System.out.println(betterfb(9));
    }
    private static int betterfb(int n){
        int [] x = new int[n+2];
        x[0] = 0;
        x[1] = 1;
        for (int i = 2; i <= n ; i++){
            x[i] = x[i-1] + x[i-2];
        }

        return x[n];
    }
}
