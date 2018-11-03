package Firecode;

import java.util.LinkedList;
import java.util.List;

public class Betterfibonacci {
    public static void main(String[] args) {

    }
    private static int betterfb(int n){
        if (n == 0) return  0;
        List<Integer> list = new LinkedList<>();
        int b = 1;
        int a = 0;
        while (list.size() < n){
            list.add(b);
            int temp = b;
            b = a +b;
            a = temp;
        }
        return list.get(n-1);
    }
}
