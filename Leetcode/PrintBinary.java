package Leetcode;

public class PrintBinary {
    public static void main(String[] args) {
        BinaryToInt(5);
    }
    public static void BinaryToInt(int n){
        if (n  > 0  ){
            BinaryToInt(n /2);
            System.out.print(n%2);
        }

    }
    //


}
