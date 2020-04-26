package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCutInHalf {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> firstHalf= new ArrayList<>();
        ArrayList<Integer> secondHalf= new ArrayList<>();


        for (int i=0; i<list.size()/2; i++){
            firstHalf.add(list.get(i));
        }
        System.out.println(firstHalf+"\t");

        for (int i=list.size()/2; i<list.size(); i++){
            secondHalf.add(list.get(i));
        }
        System.out.println(secondHalf);
    }
}
