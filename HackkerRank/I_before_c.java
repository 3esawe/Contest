package HackkerRank;

public class I_before_c {

    public static void main(String[] args) {
        System.out.println(check("icier"));
    }
    private static boolean check (String word ){
        if (word.contains("cei") ){

            return true;
        }
        else if ( word.contains("cie") || word.contains("ei")){
        return false;}




        else return true;


    }
}
