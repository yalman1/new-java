package arrayAndExeptions;

import java.util.Arrays;

public class ArrayReversing {
    public static void main(String[] args) {
        int arr[] = {1,2,45,6,23,223,23};
        System.out.println("Original array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
