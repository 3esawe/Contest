package HackkerRank;

public class Reverse_int {
    public static void main(String[] args) {
        System.out.println(reverse(1221));
    }
    public static boolean  reverse (int x){
        int reverse = 0 ;
        while (x != 0){

            reverse = reverse * 10 + x % 10;
            x /=10;
        }
        return x == reverse;
    }
}
