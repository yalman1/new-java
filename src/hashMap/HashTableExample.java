package hashMap;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String > ht=new Hashtable<>();
        String numbers="zero one two three four five six seven eight nine";
        String [] numbersArray=numbers.split(" ");
        for (int i = 0; i <numbersArray.length ; i++) {
            ht.put(i,numbersArray[i]);
        }
        //System.out.println(ht);
        ht.put(1,"one");
        ht.put(2,"two");
        ht.put(3,"three");
        //ht.put(null, null); hash table does not accept null value;
        Set<Integer> keys=ht.keySet();
        Iterator<Integer> iter=keys.iterator();
        int key;
        while(iter.hasNext()){
            key=iter.next();
            System.out.println(key+"="+ht.get(key));
        }
    }
}
