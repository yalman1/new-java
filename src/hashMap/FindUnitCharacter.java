package hashMap;

import java.util.Arrays;
import java.util.HashSet;

public class FindUnitCharacter {
    public static void main(String[] args) {
        String word="abcde";
        System.out.println(findUnique(word));
        System.out.println(findUnique2(word,true));

    }
    public static boolean findUnique ( String str){
        HashSet<Character> list =new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        //System.out.println(list);
        if(str.length()==list.size()){
            return true;
        }
        else {
            return false;
        }
    }

    // approach Two
    public static boolean findUnique2 (String word, boolean x) {
        HashSet<Character> list = new HashSet<>();
        boolean result = true;
        for (int i = 0; i < word.length(); i++) {
            if (!list.add(word.charAt(i))){
            result = false;
        }
    }
            return result;

    }
}
