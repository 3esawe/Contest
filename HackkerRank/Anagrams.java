package HackkerRank;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        Angrams("anagram","margana");
    }

    private static Boolean  Angrams(String a , String b){

        int len = a.length(); // length of the String
        Map<Character, Integer> characterIntegerMap = new HashMap<>(); // map of the charachter as keys and integer as values
        for (int i = 0; i < len ; i++){
            char charat= a.charAt(i); // the char at position i
            if(!characterIntegerMap.containsKey(charat)){ // if the char doesn't exist in the map assign it the value of 1
                characterIntegerMap.put(charat , 1);
            }
            else characterIntegerMap.put(charat , characterIntegerMap.get(charat)+ 1); // if the same char occurred we increment it's value

        }
        for (int k = 0; k < a.length(); k++){
            char letter = b.charAt(k);

            if( ! characterIntegerMap.containsKey( letter ) )
                return false;

            Integer frequency = characterIntegerMap.get( letter );

            if( frequency == 0 )
                return false;
            else
                characterIntegerMap.put( letter, --frequency);
        }
// if the code got that far it is an anagram
        return true;




    }

}
