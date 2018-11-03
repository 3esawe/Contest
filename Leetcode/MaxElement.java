package Leetcode;

public class MaxElement {
    public static void main(String[] args) {
        int [] x = {2,3,41,1};
        int c = maxelem(x, x.length -1);
        System.out.println(c);
    }
    public static int maxelem(int [] x, int n){
        if (n == 0){
            return 0;
        }
        else {
            return Math.max(maxelem(x, n-1), x[n]);
        }
    }
}
