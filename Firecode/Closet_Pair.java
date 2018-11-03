package Firecode;

import sun.nio.cs.ext.MacArabic;

public class Closet_Pair {

    public static void main(String[] args) {
        int [][] x = {{2, 3}, {12, 30}, {40, 50}, {5, 1}, {12, 10}, {3, 4}};

        double y = bruteForce(x);
        System.out.println(y);
//        double d = distance();
//        System.out.println(d);
    }



    public static double distance(int  x, int y){
        double addition = Math.pow(x,2)+Math.pow(y,2);
        return Math.sqrt(addition);
    }

    public static double bruteForce(int [][] x ){
        double min = Integer.MIN_VALUE;
        for (int i =0; i < x.length-1; i++){
            for (int j = i+1; j < x[i].length; j++) {
                if (distance(x[i][j], x[i][j]) < min) {
                    min = distance(x[i][j], x[j][i]);
                }
            }
        }
        return min;
    }
}
