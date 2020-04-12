package dataStructureAndCollection;

import java.time.chrono.MinguoDate;
import java.util.ArrayList;
import java.util.Arrays;

public class CutInHalf {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> halfList=cutHalf(number);
        System.out.println(cutHalf(number));
        System.out.println(halfList);
        cutAndPrint(number);
    }
    public static ArrayList<Integer> cutHalf (ArrayList<Integer> listToCut){
        int halfIndex =listToCut.size()/2;
        ArrayList<Integer>half =new ArrayList<>();
        for (int i = 0; i < halfIndex; i++) {
            half.add(listToCut.get(i));
        }
        return half;
    }
    public static void cutAndPrint (ArrayList<Integer> arr){
        ArrayList<Integer> half1 =new ArrayList<>();
        ArrayList<Integer> half2 =new ArrayList<>();
        int indexHalf =arr.size()/2;
        for (int i=0; i<indexHalf; i++){
            half1.add(arr.get(i));
        }
        for (int i = indexHalf; i<arr.size(); i++){
            half2.add(arr.get(i));
        }
        System.out.println(half1 + " - "+half2);
    }
}
