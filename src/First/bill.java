package First;
import java.util.Scanner;
public class bill {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.print("please enter");
        int elect = scan.nextInt();
        double electBill;
        if (elect<=500){
            electBill=elect*0.3;
        }
        else  if (elect<=1000) {
            electBill = elect * 0.4;
        }
        else if (elect<2000) {
            electBill = elect * 0.5;
        }
        else {
            electBill = elect * 0.6;
            System.out.println("electric bill");
        }

    }
}
