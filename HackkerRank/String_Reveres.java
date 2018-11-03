package HackkerRank;

public class String_Reveres {
    public static void main(String[] args) {
        Integer x  = 4;

        String A = x.toString() ;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(A);
        stringBuilder = stringBuilder.reverse();

        if (stringBuilder.toString().equals(A)){
            System.out.println("True");
        }

    }
}
