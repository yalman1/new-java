package First;
import java.util.Scanner;
public class elektricBill {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.print("enter your consumption");
        int myConsumption =myScanner.nextInt();
        double electricBill;
        if(myConsumption<=500){
            electricBill =myConsumption*0.3;

        }
        else if (myConsumption<=1000) {
            electricBill =myConsumption*0.4;
        }
        else if (myConsumption<=2000) {
            electricBill =myConsumption*0.5;
        }
       else  {
            electricBill =myConsumption*0.6;//without 0 double numbers are ok like 5456
        }
        System.out.println(electricBill);
        }


    }

