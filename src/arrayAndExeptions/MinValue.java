package arrayAndExeptions;

public class MinValue {
    public static void main(String[] args) {
        int arrayNumbers[]={345,234,765,-456,4,78,268,864,34,87};
        System.out.println(findMinValue(arrayNumbers));
    }
    public static int findMinValue(int [] arr){

        int min=arr[0];  // get the first one
        for (int i=0; i<arr.length; i++){
            if(arr[i]<min){ //compare the basket and the ones on the shelf in it (current)
                min=arr[i];             // if smaller put in the basket
            }
        }
        return min;
    }
}
