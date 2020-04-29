package dataStructureAndCollection;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListNumbers {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(Arrays.asList("Java 8", "HTML 5", "Oracle 9"));
        int total = 0;
        String num = "";
        for (String str : list) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    num += str.charAt(i);
                    System.out.println(num);
                    total += Integer.parseInt(num);
                }
                num = "";
            }
        }
        System.out.println("Total : " + total);
    }
}
