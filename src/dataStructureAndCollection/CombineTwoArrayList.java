package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> firstList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> secondList = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        System.out.println(combineArrayList(firstList,secondList));

    }
    public static ArrayList<Integer> combineArrayList (ArrayList<Integer> first, ArrayList<Integer> second){
        ArrayList <Integer> result =new ArrayList<>();
        result.addAll(first);
        result.addAll(second);
        return result;
    }
}
