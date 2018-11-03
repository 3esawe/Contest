package Firecode;

import java.util.Arrays;
import java.util.Collections;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(permutation("bbbb","dddd"));
    }
    public static boolean permutation(String str1, String str2) {

        str1 = sort(str1);
        for (int i = 0; i < str2.length(); i++){
            if (str1.equals(sort(str2))){
                return true;
            }
        }
        return false;


    }
    public static String sort(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
