package Firecode;

public class Insert_Stars {
    public static void main(String[] args) {
        System.out.println(insertPairStar("abbba"));
    }
    public static String insertPairStar(String s) {
        // Error case
        if (s == null)
            return null;
            // Base case
        else if (s.length() == 1)
            return s;
            // Recursive case for matching
        else if (s.substring(0,1).equals(s.substring(1,2))) {
            String g = s.substring(0,1) + "*" + insertPairStar(s.substring(1,s.length()));
            return g;
        }
        // Recursive case for non-matching
        return s.substring(0,1) + insertPairStar(s.substring(1,s.length()));
    }
}
