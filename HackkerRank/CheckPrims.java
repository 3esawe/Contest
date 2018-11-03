package HackkerRank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckPrims{
        public static int gcd(int a , int b){
            if (a == 0){
                return b;
            }
            else {
                return gcd(b%a , a);
            }
        }

        public static List<Integer> checkprime ( int b){
            List<Integer> intlist = new ArrayList<Integer>();
            for (int i = 1; i <= b ; i++){
                if (gcd(i,b) == 1){
                    intlist.add(i);
                }
            }
            return intlist;
        }

        public static void main(String[] args) {
            List <Integer> mylist = checkprime(50);
            for (int c  : mylist ) {
                System.out.println(c);
            }
        }
 }
