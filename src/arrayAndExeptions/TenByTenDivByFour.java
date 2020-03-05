package arrayAndExeptions;

public class TenByTenDivByFour {
    public static void main(String[] args) {
        int [][]num=TenByTenArray.generateArray(10);
        printDivisibleFour(num);
    }
    public static void printDivisibleFour (int [][] arr){

        for (int [] row:arr){
            for (int number:row){
                if (number%4==0)
                System.out.print("\t"+number);
                else
                    System.out.print("\t");
            }
            System.out.println();

        }
    }
}
