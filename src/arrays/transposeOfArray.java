package arrays;

public class transposeOfArray {
    public static void main(String[] args) {
        int num[][]={{1,2,3},{4,5,6},{7,8,9}};
        int[][] result=(colAsRow(num));
        for (int row []:result){
            for (int arr :row){
                System.out.print("\t"+arr);
            }
            System.out.println();
        }

    }
    public static int[][] colAsRow (int [][] arr) {
        int exchange[][]=new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                exchange[j][i]= arr [i][j];
            }
        }
        return exchange;
    }
}
