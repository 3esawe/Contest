package Firecode;

public class Pow {
    public static double pow(double x, int n) {

        if (n >= 0){
            if (n == 0) {
                return 1;
            }

            return pow(x, n - 1) * x;
        }
        else if (n < 0){
            if (n ==0){
                return 1;
            }

            return pow(x, n +1) /x;
        }
        return -1;


    }
}
