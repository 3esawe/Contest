package HackkerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_3 {
    public static void main(String[] args) {
        int [] x = {-2,0,0,2,2};
        Sum3(x);
    }
    public static List<List<Integer>> Sum3 (int [] x){


        Arrays.sort(x);
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0 ; i < x.length-2; i++){
            int j = i+1;
            int k = x.length-1;
            while (k > j){
                int sum = x[i] + x[j] + x[k];
                if  ( sum == 0 ){

                    lists.add(Arrays.asList(x[i],x[j],x[k]));
                    k--;
                    j++;
                    while (j < k && x[j] == x[j - 1]) j++;  // skip same result
                    while (j < k && x[k] == x[k + 1]) k--;

                }
                if ( sum >= 0){
                    --k;
                }
                else ++j;
            }
        }
        return lists;
    }

}
