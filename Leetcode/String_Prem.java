package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class String_Prem {
    public static void main(String[] args) {
        permute("CAT",0,2);
    }
    private static void permute(String str, int l, int r)
    {
        if (l == r){
            System.out.println(str);
        }

        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                System.out.println(l + "*" + i);
                str = swap(str,l,i);
                System.out.println(l + "-" + i);

            }

        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
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
