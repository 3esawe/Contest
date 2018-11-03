package Leetcode;

public class Climbstairs {
    public static void main(String[] args) {
        System.out.println(climb(5));
    }
    public static int climb(int n){
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

    }
}
