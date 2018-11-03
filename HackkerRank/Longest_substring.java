package HackkerRank;

import java.util.HashMap;
import java.util.Map;

public class Longest_substring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    /*
    * we create two pointers i & j
      * i to denote the indices for the character in the string
      * j to update the indices in the map for the duplicated chars
    * we get the max length of the longest non-reapeted chars of substring
      * we keep updating max value each iteration by (i-j+1) and taking the max from these two values
      */
    public static int lengthOfLongestSubstring(String s){
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;




    }
}
