package HackkerRank;

import java.util.SortedSet;
import java.util.TreeSet;

public class Java_String_Comp {
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava",3));

    }
    public static String getSmallestAndLargest(String s , int k){
        String smallest = "";
        String largest = "";
        SortedSet<String> sets=new TreeSet<String>();
        for(int i=0;i<=s.length()-k;i++){
            sets.add(s.substring(i,i+k));
        }
        return sets.first() + "\n" + sets.last();
    }
}
