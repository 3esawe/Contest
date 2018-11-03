package HackkerRank;

import java.util.Scanner;
//https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/
public class Varargs {
    public static void main(String[] args) {
            add(1,2,3,4,5,6);
    }
    public static void add(int... intArgs) {
        int sum = 0;
        String separator = "";
        for (int i : intArgs) {
            sum += i;
            System.out.print(separator + i);
            separator = "+";
        }
        System.out.println("=" + sum);
    }
}
