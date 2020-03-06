package arrayAndExeptions;

import java.util.Arrays;

public class DeleteNumber {
    public static void main(String[] args) {
        int[] arr1 = {8, 3, 32, 4, 3, 4, 56, 6, 34, 2, 5443, 3, 3, 3, 54, 324, 543, 3421, 13, 3, 434, 23};
        int numberToDelete = 3;
        int count = 0;
        for (int i:arr1) {
            if (i == numberToDelete) {
                count++;
            }
        }
        System.out.println("Count of " + numberToDelete + " in array is: " + count);
        int[] arr2 = new int[arr1.length - count];
        int [] arr3=new int[arr1.length+numberToDelete];
        for (int i=0, j=0, k=0; i < arr1.length; i++) {
            if (arr1[i] != numberToDelete) {
                arr2[j] = arr1[i];
                j++;
                arr3[k]=arr1[1];
            }
        }
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr1 = "+Arrays.toString(arr1));
        System.out.println("arr 3= "+ Arrays.toString(arr3));
    }
}
