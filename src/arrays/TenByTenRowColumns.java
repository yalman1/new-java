package arrays;

public class  TenByTenRowColumns {
    public static void main(String[] args) {
        int [][]num=TenByTenArray.generateArray(3);
      printColumnsSum(num);

    }
    public static void printColumnsSum (int [][]arr){

        for (int i=0; i<arr.length; i++){
            int sum=0;
            for (int j=0; j<arr[i].length; j++){
                sum=sum+arr[j][i];
            }
            System.out.println("Sum of columns "+i+ "  :  "+sum);
    }

    }

}
