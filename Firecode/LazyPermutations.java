package Firecode;

import java.util.LinkedList;
import java.util.List;

public class LazyPermutations {
    public static void main(String[] args) {
        System.out.println(permutation("firecode ", "codefire"));
    }
    // java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
    static List<String> list = new LinkedList<>();
    public static boolean permutation(String str1, String str2) {
        List<String> prems = premlist(str1 , 0, str2.length() -1);
        for (int i = 0; i < prems.size(); i++){
            if(prems.contains(str2)){
                return true;
            }
        }
        return false;


    }

    public static List<String> premlist (String s, int l , int r){
        if (l == r){
            list.add(s);
        }
        else{
            for (int i = l; i <= r ; i++ ){
                s = swap (s,l,i);
                premlist(s,l+1,r);
                s = swap(s,l,i);
            }

        }
        return list;

    }

    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }


}
