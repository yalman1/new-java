package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class UpperCase {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Java, Is, Fun"));
        ArrayList<String> myList1 = new ArrayList<>(Arrays.asList("Java, Is, Super"));
        list.add(myList);
        list.add(myList1);
        list.get(1).add("AAAAA");
        System.out.println(list);
        findUpperCases(list);
        findUpperCasesInWord(list);

    }
    public static void findUpperCases (ArrayList<ArrayList<String >> arr){
        int counterWord;
        int counterRow;
        for (int i=0; i<arr.size(); i++){   //to fetch one dim string arrays
            counterRow=0;
            for (int j=0; j<arr.get(i).size(); j++){      //to fetch string elements
                counterWord=0;
                for (int k=0; k<arr.get(i).get(j).length(); k++){   //to fetch chars
                    if(Character.isUpperCase(arr.get(i).get(j).charAt(k))){
                        counterWord++;
                    }
                }
                counterRow+=counterWord;
            }
            System.out.println("there are "+counterRow+"upper cases at row"+(i+1));
        }

    }
    public static void findUpperCasesInWord (ArrayList<ArrayList<String>> arr){
        int countWord;
        for (int i = 0; i < arr.size() ; i++) {
            for (int j = 0; j < arr.get(i).size() ; j++) {
                countWord=0;
                for (int k = 0; k < arr.get(i).get(j).length() ; k++) {
                    if(Character.isUpperCase(arr.get(i).get(j).charAt(k))){
                        countWord++;
                    }

                }
                System.out.println("There are "+countWord+" upper cases in "+arr.get(i).get(j));
            }
        }

    }
}
