package hashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CountNumberOccurences {
    public static void main(String[] args) {
        HashMap <Integer, Integer> list =new HashMap<Integer, Integer>();

        int index=0;
        for (int number :list.keySet()){
            index+=number;
        }
        for (int i : list.values()) {
            Integer j = list.get(i);
            list.put(i, (j == null) ? 1 : j + 1);
        }
    }
}
