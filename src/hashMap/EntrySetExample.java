package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class EntrySetExample {
    public static void main(String[] args) {

        HashMap<String,String> hm = new HashMap<>();


        hm.put("A","B");
        hm.put("C","D");
        System.out.println(hm);
        System.out.println(hm.entrySet());
        Iterator hmIter = hm.entrySet().iterator();
        while(hmIter.hasNext()){
            Map.Entry mapItem = (Map.Entry)hmIter.next();
            System.out.println(mapItem.getKey() + " = "+mapItem.getValue());
        }
    }
}
