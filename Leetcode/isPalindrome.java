package Leetcode;

public class isPalindrome {
    public static void main(String[] args) {
        boolean  c = isPal("babad");
        System.out.println(c);
    }
    public static boolean isPal(String v){
        if (v.length() < 2) return true;
        else {
            char last = v.charAt(0);
            char first = v.charAt(v.length() - 1);
            if (last == first){
                String rem = v.substring(1, v.length() -1);
                return  isPal(rem);
            }
            else return false;
        }

    }
}
