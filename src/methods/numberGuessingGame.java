package methods;

import java.util.Scanner;

public class numberGuessingGame {
    public static void guessTheNumber (int number){
        Scanner scan=new Scanner (System.in);
        int userGuess=0;
        while (userGuess!=number){
            System.out.print("Guess the number") ;
            userGuess=scan.nextInt();
            if (userGuess==number){
                System.out.println("CONGRATS");
            }
            else if (userGuess>number){
                System.out.println("Try smaller");
            }
            else {
                System.out.println("Try larger");
            }
        }
    }
}
