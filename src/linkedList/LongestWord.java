package linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LongestWord {
    public static void main(String[] args) {
        LinkedList <String> list =new LinkedList<>(Arrays.asList("Java", "is", "always","super","fun"));
        int index=0;
        int longest =0;
        for (int i=0; i<list.size(); i++){
            if(list.get(i).length()>longest) {
                longest = list.get(i).length();
                index=i;
                System.out.println(list.get(i));
            }
        }
        System.out.println("The longest word is  :"+list.get(index));

        // shortest

        findShortest(list);
    }
    public static void findShortest(LinkedList<String> arr) {

        int shortest=arr.get(0).length();
        String shortestWord="";
        for(int i=1 ; i<arr.size() ; i++){
            if(arr.get(i).length()<shortest){
                shortest=arr.get(i).length();
                shortestWord=arr.get(i);
            }
        }
        System.out.println("The shortest word is : "+shortestWord);
    }
}
