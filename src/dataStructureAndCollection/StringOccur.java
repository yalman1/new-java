package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class StringOccur {
    public static void main(String[] args) {
            ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();
            for (int i = 0 ; i < 10 ; i++) { //rows
                numbers.add(new ArrayList<>());
                for (int j = 0 ; j < 10 ; j++) { //elements in a row
                    numbers.get(i).add((int)(Math.random()*90)+10);
                }
            }
            Iterator<ArrayList<Integer>> iter = numbers.iterator();
            while (iter.hasNext()){
                System.out.println(iter.next());
            }
            System.out.println("----------------------------");
            int[]window = {2,3};
            multiplyWithArray(numbers,window);
        }
        public static  void multiplyWithArray(ArrayList<ArrayList<Integer>> arr, int[] window){
            int increment = window.length;
            int result;
            for (int i = 0; i < arr.size() ; i++) {
                for (int j = 0; j < arr.get(i).size(); j+=increment) {
                    //System.out.println("j="+j);
                    for(int k = 0; k < window.length; k++){
                        result=arr.get(i).get(j+k)*window[k];
                        arr.get(i).set(j+k,result);
                    }
                }
            }
            Iterator<ArrayList<Integer>> iterator = arr.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
}
