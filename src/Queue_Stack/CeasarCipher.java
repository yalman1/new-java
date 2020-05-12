package Queue_Stack;

import java.util.LinkedList;
import java.util.Queue;

public class CeasarCipher {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(25);
        q.add(37);
        q.add(12);
        int value;
        for (int i = 0; i < 10 ; i++) {
            value = q.poll();
            System.out.print("Removed:"+value+"\tQueue:"+q);
            q.add(value);
            System.out.println("\t After "+value+" added:"+q);
        }
        System.out.println("Java is fun");
        System.out.println(ceasarCipher("Java is fun"));
    }
    public static String ceasarCipher(String word){
        String result="";
        Queue<Integer> key = new LinkedList<>();
        key.add(3);
        key.add(1);
        key.add(7);
        key.add(4);
        key.add(2);
        key.add(5);
        char ch;
        int keyValue;
        for (int i = 0; i < word.length() ; i++) {

            ch = word.charAt(i);
            if(ch!=' ') {
                keyValue = key.poll();
                ch += keyValue;
                result += ch;
                key.add(keyValue);
            }
            else {
                result+=ch;
            }
        }
        return result;
    }

}
