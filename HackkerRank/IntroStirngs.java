package HackkerRank;

import java.util.Scanner;

public class IntroStirngs {
    static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String A =  scanner.nextLine();
        String B = scanner.nextLine();
        int len =( A.length() + B.length());
        System.out.println(len);
        int comp = A.compareTo(B);
        if (comp > 0){
            System.out.println("Yes");
        }
        else System.out.println("No");
        String newA = A.substring(0,1).toUpperCase() + A.substring(1);
        String newB = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(newA +" "+ newB);
    }
}
