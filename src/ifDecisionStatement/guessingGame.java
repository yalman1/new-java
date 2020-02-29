package ifDecisionStatement;
import java.util.Scanner;
public class guessingGame {
    public static void main(String[] args) {
        int numberToGuess =23;
        Scanner scan =new Scanner (System.in);
        System.out.println("guess the number" );
        int userGuess =scan.nextInt();

        if (userGuess>numberToGuess) {
            System.out.println("number is larger");
        }
        else if (userGuess<numberToGuess){
            System.out.println("number is smaller");
        }
        else{
            System.out.println("congrats");
        }




    }
}
