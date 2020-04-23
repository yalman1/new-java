package hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetPhoneBook {
    public static void main(String[] args) {
        TreeSet<String> phoneBook = new TreeSet<String>(Arrays.asList("Jon Doe : 567 345 3377"));
        System.out.println(phoneBook);
        List<String> names = new ArrayList<>(Arrays.asList("Brad Pitt : 555 555 5555","Bill Gates : 234 544 2323","James Gosling : 344 563 2356"));
        phoneBook.addAll(names);
        System.out.println(phoneBook);

        Iterator<String> iterator = phoneBook.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
