package hashMap;

import java.util.Arrays;
import java.util.HashSet;

public class FindDistinct {
    public static void main(String[] args) {
        String sentence="can a fish fish a fish in a fish can";
        String [] words =sentence.split(" ");
        System.out.println(Arrays.toString(words));
        HashSet<String> list =new HashSet<>();

        //to add to hashSet
        for( String word: words){
            list.add(word);
        }
        System.out.println(list);
    }
}
