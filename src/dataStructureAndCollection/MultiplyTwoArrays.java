package dataStructureAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyTwoArrays {
    public static void main(String[] args) {
        ArrayList <Integer> number1 =new ArrayList<>(Arrays.asList(2,5,4,2));
        ArrayList<Integer> number2=new ArrayList<>(Arrays.asList(6,4,5,2));
        System.out.println(multiply(number1,number2));


    }
    public static ArrayList<Integer> multiply (ArrayList<Integer> num1, ArrayList<Integer> num2){
        ArrayList<Integer> mul =new ArrayList<>();
        for(int i=0; i<num1.size(); i++) {
            mul.add(num1.get(i)*num2.get(i));
        }
        return mul;
    }
}
