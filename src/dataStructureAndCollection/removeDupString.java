package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDupString {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<String >(Arrays.asList("ab","cd","ef","ab","cd"));
        ArrayList<String> newList =new ArrayList<>();

        for (String word:list){
            if (!newList.contains(word)){
                newList.add(word);
            }
        }
        System.out.println(newList);
    }
}
