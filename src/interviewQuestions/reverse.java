package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        String myStrReverse ="Hello world";
        StringBuilder mystr=new StringBuilder (myStrReverse);
        System.out.println(mystr.reverse());
        reverseString2(myStrReverse);

        ArrayList<Integer> number= new ArrayList<>(Arrays.asList(1,2,3,4,5));
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
    public static String reverseString2 (String str){
        String reverse="";
        for (int i =str.length()-1; i <=0 ; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }
    public static void reverseString3 (String str){
        //use charArray
        str="Hello world";
        char [] charArr=str.toCharArray();
        for (int i = charArr.length-1; i <=0; i++) {
            System.out.println(charArr[i]);
        }
    }
    public static void reverseArrayList (){
        ArrayList<Integer> number= new ArrayList<>(Arrays.asList(1,2,3,4,5));
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
