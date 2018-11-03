package HackkerRank;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        sc.close();
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(s.getBytes());
            System.out.println(DatatypeConverter.printHexBinary(
                    md.digest()).toLowerCase());}
        catch (NoSuchAlgorithmException e) {
            System.out.println("I'm sorry, but MD5 is not a valid message digest algorithm");
        }
    }
}
