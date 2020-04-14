package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDimArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> firstTowDim =new ArrayList<>(5);
        System.out.println(firstTowDim);
        firstTowDim.add(new ArrayList<>());
        firstTowDim.add(new ArrayList<>());
        firstTowDim.add(new ArrayList<>());
        System.out.println(firstTowDim);
        for (int i = 0; i <3 ; i++) {
            for (int j=0; j<5; j++){
                firstTowDim.get(i).add((int)Math.pow(j,2));

            }

        }
        ArrayList<Integer> toInsert =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(firstTowDim);
        firstTowDim.add(toInsert);
        System.out.println(firstTowDim);
    }
}
