package Firecode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Isomorphic {
    public static void main(String[] args) {
        System.out.println(IsomorphicString("abcd","aabb"));
    }
    public static boolean IsomorphicString(String c, String d){
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0;i < c.length();i ++){
            if(!map.containsKey(c.charAt(i))){
                map.put(c.charAt(i),d.charAt(i));
            }
            else if (map.containsKey(c.charAt(i)) && !map.containsValue(d.charAt(i))){
                return false;
            }
            if (map.get(c.charAt(i))  == map.get(d.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
