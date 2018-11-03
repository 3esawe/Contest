package HackkerRank;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            hm.put(name, phone);
            in.nextLine();
        }
        for (Map.Entry<String,Integer>  x : hm.entrySet()){
            if (x.getValue() == null){
                System.out.println("Not found");
            }
            else System.out.println(x.getKey()+"="+x.getValue());
        }
    }
}
