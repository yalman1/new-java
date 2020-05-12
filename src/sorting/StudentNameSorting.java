package sorting;

import java.util.Comparator;

public class StudentNameSorting implements Comparator <Student> {
    public int compare (Student st1, Student st2){
        return st1.name.compareTo(st1.name);
    }

}
