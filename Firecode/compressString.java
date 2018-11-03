package Firecode;

import java.util.HashMap;
import java.util.Map;

public class compressString {
    public static void main(String[] args) {
        String s = CompressString("aaabbbccc");
        String v = compressString1("aaabbbccc");
        System.out.println(v);
    }

    // other solution
    public static String compressString1(String text) {
        if (text == null) return null;

        if (text.isEmpty()) return "";

        int count = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            count++;

            if (i + 1 >= text.length() || text.charAt(i) != text.charAt(i + 1)) {
                builder.append(text.charAt(i));
                if (count > 1) {
                    builder.append(count);
                }
                count = 0;
            }

        }

        return builder.toString();
    }
    // my solution
    public static String CompressString(String text){
        Map<Character,Integer> map = new HashMap<>();
        char[] letters = text.toCharArray();
        for (int i = 0; i < letters.length; i++){
            if(!map.containsKey(letters[i])){
                map.put(letters[i], 1);
            }
            else {
                map.put(letters[i], map.get(letters[i]) + 1);
            }
        }
        String s = "";
        for (Map.Entry<Character, Integer> entry: map.entrySet()){
            if (entry.getValue() > 1){
                s += entry.getKey() + ""+entry.getValue();

            }
            else {
                s += entry.getKey() + "";
            }

        }
        return s;
    }
}
