package ifDecisionStatement;
import java.util.Scanner;
public class purchaseCar {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("which model do you want X or Y");
        String model=scan.next();
        int MSRP=0;
        if (model.equals("X")) {
            MSRP=30000;
            System.out.println("Do you want body package : (y/n)");
            String body =scan.next();
            if (body.equalsIgnoreCase("Y")){
                MSRP = MSRP +5000;
            }
            else if(model.equals("X")){
                System.out.println("do you want sound package: (y/n)");
                String sound =scan.next();
                 if (sound.equalsIgnoreCase("N")){
                   MSRP+=3000;
                }
            }

        }
        else if (model.equals("Y")){
            MSRP=35000;
            System.out.println("Do you want entertainment package: (y/n)");
            String entertainment =scan.next();
            if (entertainment.equalsIgnoreCase ("Y")){
                MSRP+=8000;

                System.out.println("safety packeage ?: (y/n)");
                String safety = scan.next();
                if (safety.equalsIgnoreCase("y")){
                    MSRP+=4000;
                }

            }
                else if (model.equals ("Y")){
                System.out.println("Do you want safety: (y/n)" );
                String safety =scan.next();
                if (safety.equals("N"));
                MSRP =MSRP+4000;
            }

        }
        else {
            System.out.println("sorry have only X and Y");
        }
        if (MSRP!=0){
            System.out.println("$" +MSRP);

        }
    }
}
