package methods;

public class CommonElements {
    public static void main(String[] args) {
        int []num1={1,2,3,4,5,6,7,8};
        int [] num2 ={3,4,9,12,13};
        findCommons(num1,num2);
    }
    public static void findCommons (int[] arr1, int [] arr2 ){
        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
