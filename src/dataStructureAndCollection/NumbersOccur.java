package dataStructureAndCollection;

import java.util.HashMap;

public class NumbersOccur {
        public static void main(String[] args) {
            int arr[] = {1,2,1,1,1,4,4,4,3,4,3,2,2,};
            System.out.println(findOccur(arr));
        }
        public static HashMap<Integer,Integer> findOccur(int[] arr){
            HashMap<Integer,Integer> result = new HashMap<>();
            for (int num : arr){
                if(result.containsKey(num)){
                    result.put(num,result.get(num)+1);
                }
                else{
                    result.put(num,1);
                }
            }
            return result;
    }
}
