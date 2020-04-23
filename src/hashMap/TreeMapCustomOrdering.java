package hashMap;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapCustomOrdering {
    public static void main(String[] args) {
        TreeMap<String, Integer> pairs=new TreeMap<>(Collections.reverseOrder());
        pairs.put("BKHDTS", 1);
        pairs.put("AAFRDU", 2);
        pairs.put("CNDHYK", 3);

        System.out.println(pairs);
    }
}
