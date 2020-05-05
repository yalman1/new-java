package dataStructureAndCollection;

import java.util.Arrays;
import java.util.HashSet;

public class FindDistinctWord {
    public static void main(String[] args) {
        String sentence = "java is java";
        String words[] = sentence.split(" ");
        HashSet<String> distinct = new HashSet<>();
        for (String word : words){
            distinct.add(word);
        }
        System.out.println(distinct);
    }
}
