package dataStructureAndCollection;

import java.util.ArrayList;

public class RandomString {
    public static void main(String[] args) {
        String  letters="abcdefghijklmnopqrstuvwxyz";
               //just to see
               // System.out.println(letters.charAt((int)(Math.random()*letters.length())));
        ArrayList<String> list =new ArrayList<>();    //Empty String ArrayList
        String word;
        for (int i=0; i<100; i++) {
            word="";
            for (int j=0; j<5; j++){     //to concat chars
              word+= letters.charAt((int)(Math.random()*letters.length()));
            }
            list.add(word);
        }
        System.out.println(list);
    }
}
