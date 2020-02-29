package dataTypes;
import java.util.Scanner;
public class temperatureCheck {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("enter the substance's celsius temperature:  ");
      double temperature =scan.nextDouble();
      double number =102.5;
      while (temperature >number) {
          System.out.println("wait 5 minutes");
          temperature =scan.nextDouble();
      }

        System.out.println("the temperature is acceptable");
      System.out.println("check again after 15 minutes");



    }
}
