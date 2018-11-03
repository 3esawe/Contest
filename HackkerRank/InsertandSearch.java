package HackkerRank;

public class InsertandSearch {
    public static void main(String[] args) {
        int [] x = {2,5};
        System.out.println(InsertSearch(x, 1));
}
    public static int InsertSearch(int [] x , int k){
        if (x.length == 1  ) {
            if (x[0] < k) {
                return 1;
            } else {
                return 0;
            }
        }
        if(x[x.length-1] < k )return x.length;
        if(x[0] == k )return 0;
        if (x[0] > k) return 0;
        for (int i = 0 ; i < x.length; i ++ ){
            if (x[i] == k){
                return i;
            }

            else if ( x[i+1] > k&& x[i] < k ){

                    return i+1;

            }
            else if (k == 0){
                return 0;
            }

        }

        return -1;
    }
}
