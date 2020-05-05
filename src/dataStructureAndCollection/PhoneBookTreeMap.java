package dataStructureAndCollection;

import java.util.Iterator;
import java.util.TreeMap;

public class PhoneBookTreeMap {
    public static void main(String[] args) {
        TreeMap<String,String> phoneBook = new TreeMap<>();
        phoneBook.put("Jon Doe","43-54-353");
        phoneBook.put("Zac","23-67-3333");
        phoneBook.put("Alice ","56-36-345");
        phoneBook.put("Kelly","22-56-3213");
        System.out.println(phoneBook);
        Iterator<String> iter = phoneBook.keySet().iterator();
        String key;
        while(iter.hasNext()){
            key = iter.next();
            System.out.println(key+"\t=\t"+phoneBook.get(key));
        }
    }
}
