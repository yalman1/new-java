package revision;

import java.util.*;

public class c {
    public static void main(String[] args) {
        ArrayList<String> workers=new ArrayList<String>();
        workers.add("Ahmet");
        workers.add("Memmet  ");
        workers.add("Hande");
        workers.add("Huseyin");

        ListIterator iterator=workers.listIterator();
        System.out.println("BList from start to end...");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\nfrom end to start...");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
