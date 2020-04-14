package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,8,9,10,111));
        findMaximum(list);

    }
    public static void findMaximum (ArrayList<Integer> arr){
        int max=0;
        for (int i=0; i<arr.size(); i++)
            if(arr.get(i)>max){
                max=arr.get(i);
        }

            for (int i=0; i<arr.size();i++){
                arr.set(i,max);
            }
        System.out.println(arr);
    }
}
