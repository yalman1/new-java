package sorting;

import java.util.Comparator;

public class StudentIdSorting implements Comparator<Student> {
    public int compare (Student st1, Student st2){
        if(st1.id==st2.id){
            return 0;
        }
        else if (st1.id>st2.id){
            return 1;
        }
        else {
            return -1;
        }
    }
}
