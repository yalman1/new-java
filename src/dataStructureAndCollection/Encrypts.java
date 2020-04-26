package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Encrypts {
    public static void main(String[] args) {
        String word="apple";
        System.out.println(encryptss(word));
        // second
        String words[] = {"apple","banana","karaca"};
        for (String sen : words){
            System.out.println(applyKaraca(sen));
        }

    }
    public static String encryptss (String word){
        //step 1
        StringBuilder sb = new StringBuilder(word);
        String str = sb.reverse().toString();

        //step2
        str = str.replace("a","0");
        str = str.replace("e","1");
        str = str.replace("o","2");
        str = str.replace("u","3");

        //step3
        str += "aca";

        return str;
    }

    public static String applyKaraca(String word){
        //step 1 reverse the string
        StringBuilder result = new StringBuilder(word);
        result.toString();
        result.reverse();
        //step 2 replace vowels
        HashMap<Character,Character> hm = new HashMap<>();
        hm.put('a','0');
        hm.put('e','1');
        hm.put('o','2');
        hm.put('u','3');
        char letter;
        String realResult="";
        for(int i = 0 ; i < result.length() ; i++){
            letter=result.charAt(i);
            if(hm.containsKey(letter)){
                realResult+=hm.get(letter);
            }
            else{
                realResult+=result.charAt(i);
            }
        }
        //step 3 add "aca"
        realResult+="aca";
        return realResult;
    }

}
