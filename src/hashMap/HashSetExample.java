package hashMap;

import java.nio.charset.IllegalCharsetNameException;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> list=new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(2);
        System.out.println(list);

    }
}
