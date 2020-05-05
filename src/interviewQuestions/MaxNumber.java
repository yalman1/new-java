package interviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxNumber {
    public static void main(String[] args) {
        int num [] = {1,2,3,4,5,6};

        System.out.println(maximum4(num));
    }
    public static void maximum (int []a){
        int max=0;

        for (int i = 0; i <a.length ; i++) {
            if (a[i]>max);
            max=a[i];
        }
        System.out.println(max);

    }
    public static void maximum2 (int []a){
        Arrays.sort(a);
        System.out.println(a[a.length-1]);
    }
    public static int maximum3 (Integer[] a){
        List<Integer> list=Arrays.asList (a);
        Collections.sort(list);
        int largest=list.get(a.length-1);
        return largest;

    }
    public static int maximum4 (int[] a){
        int tempMax=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i]>a[j]){
                    tempMax=a[i];
                    a[i]=a[j];
                    a[j]=tempMax;
                }
            }
        }
        return tempMax;
    }
}
