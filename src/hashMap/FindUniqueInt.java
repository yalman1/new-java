package hashMap;

import java.util.HashSet;

public class FindUniqueInt {
    public static void main(String[] args) {
        int myNum=1234555678;
        isUnique(myNum);

    }
    public static void isUnique(int number){
        String str="";
        str+=number;
        HashSet<Character> chars=new HashSet<>();
        for (int i = 0; i <str.length() ; i++) {
            chars.add(str.charAt(i));
        }
        if (str.length()==chars.size()){
            System.out.println("All characters are unique");
        }
        else {
            System.out.println("Not unique");
        }
    }
}
