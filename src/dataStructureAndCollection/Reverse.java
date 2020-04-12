package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        ArrayList <Integer> number= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList <Integer> reversedNumber=new ArrayList<>();
        for (int i=number.size()-1; i>=0; i--){
            reversedNumber.add(number.get(i));
        }
        System.out.println(reversedNumber);

        // solution with one ArrayList
        int temp;
        int index=number.size()-1;
        for (int i=0; i<number.size()/2; i++) {
            temp = number.get(i);
            number.set(i,number.get(index));
            number.set(index,temp);
            index--;
        }
        System.out.println(number);
    }
}
