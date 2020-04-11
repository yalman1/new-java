package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList <Integer>  myList =new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        myList.add(4);
        myList.add(10);
        myList.add(50);
        myList.remove(0);

        //regular loop
        for (int i=0; i<myList.size(); i++){
            System.out.print(myList.get(i));
        }
        System.out.println();
        //for each loop

        for (int element :myList) {
            System.out.print(element);
        }
        System.out.println();

        //while loop
        int index=0;
        while(index<myList.size()) {
            System.out.println(myList.get(index));
            index++;

        }   }
}
