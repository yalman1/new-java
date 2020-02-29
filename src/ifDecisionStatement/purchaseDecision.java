package ifDecisionStatement;
import java.util.Scanner;
public class purchaseDecision {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("please enter color (blue/red)");
        String color = myScan.nextLine();
        System.out.println("please enter tag price:");
        double priceTag = myScan.nextDouble();
        System.out.println("please enter discount percentage(0.1-0.9");
        float discount = myScan.nextFloat();

        int colorValue = 0;
        if (color.compareToIgnoreCase("red") == 0) {
            colorValue = 20;

        } else if (color.compareToIgnoreCase("blue") == 0) {
            colorValue = 10;
        } else {
            System.out.println("red or blue only");
        }
        int productPoint = (int) (priceTag * discount - colorValue);
        if (productPoint >= 100) {
            System.out.println("do not buy it");

        }
        if (productPoint >= 50) {
            System.out.println("buy it later");
        } else {
            System.out.println("buy it right now");
        }
    }
}
