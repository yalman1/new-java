package dataStructureAndCollection;

import java.util.ArrayList;

public class ConvertingStringToChar {
    public static void main(String[] args) {
        String sentence ="Java is fun";
        ArrayList<Character> myList =new ArrayList<>();
       for (int i=0; i<sentence.length(); i++){
           myList.add(sentence.charAt(i));
       }
        System.out.println(myList);
    }
}
