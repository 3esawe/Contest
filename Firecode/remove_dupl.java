package Firecode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class remove_dupl {
    public static void main(String[] args) {

    }
    public static ArrayList<String> removeDuplicates(List<String> input) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < input.size(); i ++){
            if (input.contains(input.get(i)) && !arrayList.contains(input.get(i))){
                arrayList.add(input.get(i));
            }
        }
        Collections.sort(arrayList);
        return arrayList ;

    }
}
