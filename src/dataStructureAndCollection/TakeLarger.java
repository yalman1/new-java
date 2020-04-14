package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class TakeLarger {
    public static void main(String[] args) {
        ArrayList <Integer> list =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,8));
        takeTheLargerOne(list);

    }
    public static void takeTheLargerOne (ArrayList<Integer> arr){

        int max;
        if(arr.get(0)>arr.get(arr.size()-1)){
            max=arr.get(0);
        }
        else {
            max=arr.get(arr.size()-1);
        }
        for (int i = 0; i < arr.size() ; i++) {
            arr.set(i,max);
        }
        System.out.println(arr);


    }
}
