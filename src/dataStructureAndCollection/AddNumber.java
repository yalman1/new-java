package dataStructureAndCollection;

import java.util.ArrayList;

public class AddNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList <Integer>();
        System.out.println(numbers);
        for (int i = 1; i <=1000 ; i++) {
            numbers.add(i);
        }
        //System.out.println(numbers);
        for (int number:numbers){
            System.out.println(number);
        }
    }
}
