package Queue_Stack;

import java.util.LinkedList;
import java.util.Queue;

public class second {
    public static void main(String[] args) {
        Queue<String > myQ=new LinkedList<>();
        myQ.add("abc");
        myQ.add("def");
        myQ.add("ghi");
        myQ.add("jkl");
        myQ.add("mno");
        System.out.println("Before :"+myQ);

        for (int i = 0; i <5 ; i++) {
            System.out.println(myQ.poll());
        }
        System.out.println("After : "+myQ);

    }
}
