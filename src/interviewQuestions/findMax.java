package interviewQuestions;

import java.util.Arrays;

public class findMax {
    public static void main(String[] args) {
        int number[]={1,2,5,4,3,5,6,7,5,6,76,76,79};
        System.out.println(findMax(number));
        System.out.println(largestValue(number));
    }
    public static int findMax (int arr[]){
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max);
            max=arr[i];
        }
        return max;
    }
    public static int largestValue(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }
}
