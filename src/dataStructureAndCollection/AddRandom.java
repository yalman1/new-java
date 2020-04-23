package dataStructureAndCollection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;

public class AddRandom {
    public static void main(String[] args) {
        ArrayList <Integer> myList =new ArrayList <Integer>();
        Random ran = new Random();
       // System.out.println(ran.nextInt(1000));
        for (int i = 1; i <=10 ; i++) {
            myList.add(ran.nextInt(1000));
        }
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);

        System.out.println("min number is :" +myList.get(0));
        System.out.println("max number is :"+myList.get(myList.size()-1));
        System.out.println("Median is :"+myList.get(myList.size()/2));


    }

}
