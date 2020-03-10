package arrayAndExceptions;

public class MaxValue {
    public static void main(String[] args) {
        int arrayNumbers[]={345,234,765,456,4,78,268,864,34,87};
        System.out.println(findMaxValue(arrayNumbers));
    }
    public static int findMaxValue( int[] arr ){
        int max=arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
