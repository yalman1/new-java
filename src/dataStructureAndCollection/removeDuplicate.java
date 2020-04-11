package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {
        ArrayList <Integer> myList =new ArrayList<Integer>(Arrays.asList(1,2,4,2,3,4,5));
        ArrayList <Integer> newList =new ArrayList<>();

        for (int number:myList){
             if (!newList.contains(number)){
                 newList.add(number);
             }
        }
        System.out.println(newList );
    }
}
