package arrays;

import java.util.Arrays;

public class duplicateNumbers {
    public static void main(String[] args) {
        int []num={1,2,3,4,5,4,5};
        System.out.println(Arrays.toString(removeDuplicates(num)));
    }
    public static boolean findTheDuplicate (int value, int [] arr){
        boolean result=false;
        for (int number :arr){
            if (number==value){
                result=true;
                }
            }
        return result;
        }
        public static int [] removeDuplicates (int[]arr){
        int [] removedDup =new int [arr.length];
        int index=0;
        /*for (int element:arr){
            if (!findTheDuplicate(element,removedDup)){
                removedDup[index]=element;
                index++;
            }

         */
            for(int i=0; i<arr.length; i++){
                if (!findTheDuplicate(arr[i], removedDup)){
                    removedDup[i]=arr[i];
                }
        }
        return removedDup;
        }

    }
