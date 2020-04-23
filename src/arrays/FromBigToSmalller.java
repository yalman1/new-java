package arrays;

public class FromBigToSmalller {
    public static void main(String[] args) {
        sortedArray();
    }
    public static void sortedArray(){
        int [] arr = {12,6,45,7,19,0,3};
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    int temp =arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}
