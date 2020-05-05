package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] num={5,4,1,8,2};
       sorting(num);

        }
        public static void sorting (int[]arr){
        int temp;
            for (int i = 1; i <arr.length ; i++) {
                System.out.println("iteration :"+i+"\t"+Arrays.toString(arr));
                for (int j = i; j>0 ; j--) {
                    System.out.print("   "+arr[j]+"<"+arr[j-1]+"\t\t");

                    if (arr[j]< arr[j-1]){
                       temp =arr[j];
                       arr[j] =arr[j-1];
                       arr[j-1]=temp;
                    }
                    System.out.print("\t"+Arrays.toString(arr));
                }
                System.out.println();
        }
            System.out.println(Arrays.toString(arr));
    }
}
