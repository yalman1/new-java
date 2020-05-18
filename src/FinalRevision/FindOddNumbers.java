package FinalRevision;

import java.util.HashMap;

public class FindOddNumbers {
    public static void main(String[] args) {
        int number[]={1,2,4,7,2,3,6,5,4,3,2,1,3};
        findOdd(number);
        System.out.println();
        findWithHashMap(number);


    }
    public static void findOdd(int [] arr){
        int counter;
        for (int i = 0; i < arr.length-1; i++) {
            counter=0;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j]);
                counter++;
            }
            if (counter%2==1){
                System.out.println(arr[i]+"\t=\t"+counter);

            }
        }
    }
    public static void findWithHashMap (int arr[]){
        HashMap<Integer,Integer> hm=new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else {
                hm.put(arr[i],1);
            }
        }
        for (int key:hm.keySet()){
            if(hm.get(key)%2==1){
                System.out.println(key+"\t=\t"+hm.get(key));
            }
        }
    }
}
