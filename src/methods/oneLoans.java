package methods;
import java.util.Scanner;
public class oneLoans {
    public static void main(String[] args) {
        System.out.println(calculateMortgageLoan( 2400, 15));
        System.out.println(calculateCarLoan(24000, 36));
    }
    public static int calculateMortgageLoan( int monthly, int monthNum){
        Scanner scan =new Scanner (System.in);
        System.out.println("please enter total Amount ");
        int totalAmount =scan.nextInt();

        int restPayment=totalAmount - monthly*monthNum;
        return restPayment;
    }
    public static double calculateCarLoan (int totalCar, int paymentNum){
        double result;
        int monthly =230;
        result =(totalCar/paymentNum)*0.9-paymentNum;
        return result;
    }
}
