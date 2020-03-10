package arrayAndExceptions;

public class minumumValueTwoDim {
    public static void main(String[] args) {
        int [][] num={{34,65,2,4,6,98,7},{34,76,1,34,65,9}};
        System.out.println(findMinimumValue(num));
    }
    public static int findMinimumValue (int [][] arr){
        int min =arr[0][0];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++)
            if (arr[i][j]<min){
                min =arr[i][j];
            }
        }
        return min;

    }
    public static void findMinValueVoid( int [][] arr){
        int min =arr[0][0];
        int count=0;
        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                if (arr[i][j] < min) {
                    count++;
                    System.out.println(min);
                }
        }
    }
}
