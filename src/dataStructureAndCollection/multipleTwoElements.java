package dataStructureAndCollection;

import java.util.ArrayList;

public class multipleTwoElements {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list =new ArrayList<>(10);
        multiply(list,10);

    }
    public static void multiply (ArrayList<ArrayList<Integer>> arr, int constant){
        for (ArrayList<Integer> row:arr){
            for (int value :row){
                System.out.println(value*constant+"\t\t");
            }
            System.out.println();
        }
    }
}
