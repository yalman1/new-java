package dataStructureAndCollection;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class ShiftLeftNumber {
    public static void main(String[] args) {
        int []myArr={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(shiftNum(myArr,4)));
        int [] abc={};
        shiftNum(abc,3);

    }
    public static int[] shiftNum (int [] arr, int numberOfElement){
        ArrayList <Integer> result=new ArrayList<>();
       if (arr.length>0){
           for (int i=numberOfElement; i<arr.length; i++){
               result.add(arr[i]);
           }
        }
        else {
           System.out.printf("it is empty array");
       }
        int [] realResult =new int[result.size()];
        int index=0;
        for (int num : result){
            realResult[index]=num;
        }
        return realResult;
    }

}
