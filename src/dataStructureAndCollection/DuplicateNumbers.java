package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 3, 1, 3, 4, 2));
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
        System.out.println(arrayList);
    }
}