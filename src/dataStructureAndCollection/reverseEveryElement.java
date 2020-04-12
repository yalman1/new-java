package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class reverseEveryElement {
    public static void main(String[] args) {
       ArrayList <String> arr=new ArrayList<>(Arrays.asList("Java", "is", "fun"));
       for (int i=arr.size()-1; i>=0; i--){
           System.out.println(reverseStr(arr.get(i))+" ");
       }
    }
    public static String reverseStr (String str){
     String reversed="";
     //StringBuilder myBldr=new StringBuilder(str);
     //reversed=myBldr.reverse().toString();
        for (int i=str.length()-1; i>=0; i--){
            reversed+=str.charAt(i);
        }
        return  reversed;
    }

}
