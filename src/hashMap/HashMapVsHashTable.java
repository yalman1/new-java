package hashMap;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapVsHashTable {
    public static void main(String[] args) {
        HashMap<String , String > hm=new HashMap<>();
        Hashtable<String, String> ht=new Hashtable<>();
        hm.put(null,"one");
        hm.put("two", null);
        hm.put("three", null);
        //ht.put("one", null);  // Hashtable does not allow null key or value.
        System.out.println(hm);


    }
}
