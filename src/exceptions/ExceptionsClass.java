package exceptions;

import java.util.Scanner;

public class ExceptionsClass {
    public static void main(String[] args) {
        int num1=2;
        int num2=0;
        divide(num1,num2);

        String numStr="123dss";
        int numInt =Integer.parseInt(numStr);
        System.out.println(numInt);

    }
    public static void divide (int num1, int num2) {
        try {
            System.out.println(num1 / num2);
            System.out.println("Division is successful");
        } catch (RuntimeException e) {
            //System.out.println("Division failed");
            throw new RuntimeException("you are trying to divide by zero, are you ");
            // System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }
}
