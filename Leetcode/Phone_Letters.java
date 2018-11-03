package Leetcode;

import java.util.*;

public class Phone_Letters {
    public static void main(String[] args) {
        List<String> list = letterCombinations("234");
        System.out.println(list);
    }
    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Arrays.asList();

        List<String> strings = new ArrayList<>();
        Map<Integer,String> phonemap = new HashMap<>();
        phonemap.put(2,"abc");
        phonemap.put(3,"def");
        phonemap.put(4,"ghi");
        phonemap.put(5,"jkl");
        phonemap.put(6,"mno");
        phonemap.put(7,"pqrs");
        phonemap.put(8,"vut");
        phonemap.put(9,"wxyz");
        char [] nums = digits.toCharArray();
        switch (Integer.parseInt(digits)){
            case 2:
                for (int i = 0; i < phonemap.get(Character.getNumericValue(nums[0])).length(); i++ ){
                    strings.add(phonemap.get(Character.getNumericValue(nums[0])).charAt(i)+"");
                }
                return strings;
            case 3:
                for (int i = 0; i < phonemap.get(Character.getNumericValue(nums[0])).length(); i++ ){
                    strings.add(phonemap.get(Character.getNumericValue(nums[0])).charAt(i)+"");
                }                return strings;
            case 4:
                for (int i = 0; i < phonemap.get(Character.getNumericValue(nums[0])).length(); i++ ){
                    strings.add(phonemap.get(Character.getNumericValue(nums[0])).charAt(i)+"");
                }                return strings;
            case 5:
                for (int i = 0; i < phonemap.get(Character.getNumericValue(nums[0])).length(); i++ ){
                    strings.add(phonemap.get(Character.getNumericValue(nums[0])).charAt(i)+"");
                }                return strings;
            case 6:
                for (int i = 0; i < phonemap.get(Character.getNumericValue(nums[0])).length(); i++ ){
                    strings.add(phonemap.get(Character.getNumericValue(nums[0])).charAt(i)+"");
                }                return strings;
            case 7:
                for (int i = 0; i < phonemap.get(Character.getNumericValue(nums[0])).length(); i++ ){
                    strings.add(phonemap.get(Character.getNumericValue(nums[0])).charAt(i)+"");
                }                return strings;
            case 8:
                for (int i = 0; i < phonemap.get(Character.getNumericValue(nums[0])).length(); i++ ){
                    strings.add(phonemap.get(Character.getNumericValue(nums[0])).charAt(i)+"");
                }                return strings;
            case 9:
                for (int i = 0; i < phonemap.get(Character.getNumericValue(nums[0])).length(); i++ ){
                    strings.add(phonemap.get(Character.getNumericValue(nums[0])).charAt(i)+"");
                }                return strings;
        }
//
// System.out.println(phonemap.get(Character.getNumericValue(nums[0])) + "" + phonemap.get(Character.getNumericValue(nums[1])));

        if (digits.length() ==3){
            for (int i = 0; i < phonemap.get(Character.getNumericValue(nums[0])).length(); i++){
                for (int j = 0 ; j < phonemap.get(Character.getNumericValue(nums[1])).length(); j++)
                    for (int k = 0; k < phonemap.get(Character.getNumericValue(nums[2])).length(); k++){
                        strings.add(phonemap.get(Character.getNumericValue(nums[0])).charAt(i)+ "" + phonemap.get(Character.getNumericValue(nums[1])).charAt(j) + phonemap.get(Character.getNumericValue(nums[2])).charAt(k));
                    }
            }
            return strings;
        }

        else if (digits.length() == 2){
            for (int i = 0; i < phonemap.get(Character.getNumericValue(nums[0])).length(); i++){
                for (int j = 0 ; j < phonemap.get(Character.getNumericValue(nums[1])).length(); j++)
                        strings.add(phonemap.get(Character.getNumericValue(nums[0])).charAt(i)+ "" + phonemap.get(Character.getNumericValue(nums[1])).charAt(j));
            }
            return strings;
        }
        return Arrays.asList();
    }
}
