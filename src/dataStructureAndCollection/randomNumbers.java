package dataStructureAndCollection;

import java.util.ArrayList;

public class randomNumbers {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            arr.add(new ArrayList<>());
            for (int j = 0; j <10 ; j++) {
                arr.get(i).add((int)(Math.random()*100));
            }
        }
        for (ArrayList<Integer> row : arr){
            for(int element : row){
                System.out.print(element+"\t\t");
            }
            System.out.println();
        }
    }

}
