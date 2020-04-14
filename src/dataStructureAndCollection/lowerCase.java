package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class lowerCase {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list =new ArrayList<>();
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Java Is Fun"));
        list.add(myList);
        findLowerCase(list);


    }
    public static void findLowerCase (ArrayList<ArrayList<String>> word){
        int row=0;
        int count=0;
        for (int i=0; i<word.size(); i++){
            for (int j=0; j<word.get(i).size(); j++){
                for (int k=0; k<word.get(i).get(j).length(); k++){
                    if (Character.isLowerCase(word.get(i).get(j).charAt(k))){
                        count++;
                    }
                }
                row+=count;
            }
            System.out.println("there are "+row+" lower cases on row "+(i+1));
        }
    }
}
