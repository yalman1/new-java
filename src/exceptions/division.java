package exceptions;
import java.util.Scanner;
public class division {
    public static void main(String[] args) {
        divide();

    }
    public static void divide(){
        Scanner scan= new Scanner (System.in);
        System.out.println("please write first number");
        int number=scan.nextInt();
        System.out.println("please write second number");
        int number1=scan.nextInt();

        try{
            System.out.println(number/number1);
        }
        catch (ArithmeticException e){
            System.out.println("sorry I can not divide to zero \n please try again");
        }

        System.out.println("code");
    }
}
