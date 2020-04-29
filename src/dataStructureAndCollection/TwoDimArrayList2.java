package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class TwoDimArrayList2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(5);
        int number=1;
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                list.get(i).add(number);
                number++;
            }
        }
        System.out.println(list);
        for(ArrayList<Integer> sublist : list){
            for (int numb : sublist){
                System.out.println(numb);
            }
        }
        Iterator<ArrayList<Integer>> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
