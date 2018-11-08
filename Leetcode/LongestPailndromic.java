package Leetcode;

public class LongestPailndromic {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
    public static String longestPalindrome(String s) {
        int start = 0;
        int maxlen = 1;
        boolean table [][] = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i ++){
            table[i][i] = true; // all substrings of length 1 are palindrome
        }

        for (int i = 0; i < s.length()-1; i ++){
            if (s.charAt(i) == s.charAt(i+1)){
                table[i][i+1] = true; // check for all substrings of length 2
                start  = i;
                maxlen = 2;
            }
        }
        int k ;
        for (int len = 3; len <= s.length(); len++){ // check all substring are greater than length of 3
            for (int i = 0; i < s.length() - len +1;i++){
                k = i+len-1;
                if(s.charAt(i) == s.charAt(k) && table[i+1][k-1]){ // we use or previous known information table[i+1][k-1]
                    table[i][k] = true;
                    start = i;
                    maxlen = len;
                }
            }
        }


        return s.substring(start, maxlen+ start );
    }
}
