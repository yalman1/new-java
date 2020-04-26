package dataStructureAndCollection;

import java.util.*;

public class reviewExample {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(50);
        //List<Integer> list1=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        Random ran=new Random();
        for (int i=0; i<5; i++){
            list.add( (int)(Math.random()*1000));
        }
        System.out.println(list);
        // find min
        System.out.println("minimum value :"+Collections.min(list));
        // find max
        System.out.println("Maximum Value :"+Collections.max(list));
        // sorted
        Collections.sort(list);
        System.out.println(list);
        //fin median
        System.out.println("Median :"+list.get(list.size()/2));
        // find largest 3
        System.out.println("Largest 3 : "+list.get(list.size()-1)+"\t"+list.get(list.size()-2)+"\t"+list.get(list.size()-3));
        // find minimum 3
        System.out.println("Minimum 3 :"+list.get(0)+"\t"+list.get(1)+"\t"+list.get(2));
    }
}
