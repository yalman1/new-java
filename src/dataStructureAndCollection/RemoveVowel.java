package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveVowel {
    public static void main(String[] args) {
        ArrayList<String > list=new ArrayList<>(Arrays.asList("abc", "jfh", "eit","kth"));
        System.out.println(removeVo(list));
    }
    public static ArrayList<String> removeVo (ArrayList<String> arr){
        ArrayList<String> result=new ArrayList<> ();
        for (String word :arr){
            if (!(word.contains("a") || word.contains("e") || word.contains("i"))) {
                result.add(word);
            }
        }
        return result;
    }
}
