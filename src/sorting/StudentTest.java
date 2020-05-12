package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(10);
        students.add(new Student(140,"Vahit",15));
        students.add(new Student(121,"Ismayil",12));
        students.add(new Student(192,"Sibel",8));
        students.add(new Student(133,"Birsen",14));
        Collections.sort(students,new StudentAgeSorting());
        for(Student st:students){
            System.out.println(st.id+"\t"+st.name+"\t"+st.age);
        }

        Collections.sort(students, new StudentIdSorting());
        Iterator<Student> iterator = students.iterator();
        Student temp;
        System.out.println();
        while (iterator.hasNext()){
            temp = iterator.next();
            System.out.println(temp.id+"\t"+temp.name+"\t"+temp.age);
        }

        System.out.println();
        Collections.sort(students, new StudentNameSorting().reversed());
        for(Student std : students){
            System.out.println(std.id+"\t"+std.name+"\t"+std.age);
        }
    }
}
