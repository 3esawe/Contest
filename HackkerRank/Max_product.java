package HackkerRank;


import java.util.Arrays;

public class Max_product {
    public static void main(String[] args) {
        int [] x = {-10,-3,5,6,-2};
        max_two_pairs(x);
    }
    private static void max_two_pairs(int [] array){
        Arrays.sort(array);
        for (int i = 0; i < array.length; i ++){
            int j = i;
            int k = array.length -1 ;
            int max = Integer.MIN_VALUE;
            while (k > j){
                int prod = array[j] * array[k];
                if (prod > max){
                    max = prod;

                }
                if(prod < max){
                    k--;
                }
                else j++;
            }
            System.out.println(array[j] +" " +  array[k]);
        }

    }
}
