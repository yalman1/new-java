package dataStructureAndCollection;


import java.util.Collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistFirst {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(Arrays.asList("Java","is","extremely","fun"));
        List<Integer> lenghts = new LinkedList<>();
        for (String word : list){
            lenghts.add(word.length());
        }
        System.out.println(list);
        System.out.println(lenghts);
        int index = lenghts.indexOf(Collections.max(lenghts));
        System.out.println("The largest word is :"+"\""+list.get(index)+"\""+" with the length of "+lenghts.get(index));
    }
}
