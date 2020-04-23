package arrays;

public class MaxValueTwoDim {
    public static void main(String[] args) {
        int [][] num={{234,34,56,43,246},{34,4563,456,6757,8745}} ;
        System.out.println(findMaximum(num));
    }
    public static int findMaximum (int [][] arr){
        int max=arr[0][0];
        int [] maxes = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++)
            if (arr[i][j]>max){

                maxes[i]=arr[i][j];

            }
        }
        return max;
    }
    public static void maximumVoid (int [][] sentence){

    }

}
