package inheritance;

public class StatArrays extends ArrayOps{
    protected int average;
    protected  int minValue;
    protected int maxValue;

    public StatArrays() {
        super();
        this.average = 0;
        this.minValue = 0;
        this.maxValue = 0;
    }
    public int findAverage (int a, int b){
        return this.average=(a+b)/2;
    }
    public int findMinimum (int[] num){
        int min=num[0];
        for (int i=0; i<num.length; i++){
            if(num[i]<min){
                min=num[i];
            }
        }
        return min;

    }
    public int findMaximum (int[] arr){
        int max=arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
