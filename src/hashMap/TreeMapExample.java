package hashMap;

import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> grades=new TreeMap<>();
        grades.put("Vahit", 100);
        grades.put("Shohrat", 100);
        grades.put("Rumeysa", 100);
        grades.put("Melih", 100);
        grades.put("Ali", 100);

        Iterator<String> iter =grades.keySet().iterator();
        while (iter.hasNext()){
            String keys=iter.next();
            System.out.println(keys+" = \t"+grades.get(keys));
        }

    }
}
