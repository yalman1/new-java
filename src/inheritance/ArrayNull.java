package inheritance;

import java.util.Arrays;

public class ArrayNull {
    public static void main(String[] args) {
        String a[] =new String [10];
        System.out.println(Arrays.toString(a));
        for (int i=0; i<a.length; i++){
            if (a[i]==null){
                a[i]="Available";
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
