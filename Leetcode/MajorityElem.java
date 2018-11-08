package Leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElem {
    public static void main(String[] args) {
        int [] x = {3, 3 ,4};
        System.out.println(majorityElement(x));
    }
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j: nums){
            if (!map.containsKey(j)) map.put(j,1);
            else{
                map.put(j, map.get(j) + 1 );
            }
        }
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }

        return maxEntry.getKey();
    }
}
