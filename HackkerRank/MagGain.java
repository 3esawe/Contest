package HackkerRank;

public class MagGain {
    public static void main(String[] args) {
        int [] x = {100,40,20,10};
        int y = maxGain(x);
        System.out.println(y);
    }
    public static int maxGain(int arr[]){
        int max = arr[1] - arr[0];
        int min = arr[0];
        int i;
        for(i = 1; i < arr.length; i++)
        {
            if (arr[i] - min > max)
                max = arr[i] - min;
            if (arr[i] < min)
                min = arr[i];
        }
        return max < 0 ? 0 : max;
    }
}
