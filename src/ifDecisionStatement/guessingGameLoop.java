package ifDecisionStatement;

import java.util.Scanner;

public class guessingGameLoop {
    public static void main(String[] args) {
        int numberToGuess = 23;
        //first time asking to user
        Scanner scan = new Scanner(System.in);
        System.out.println("guess the number");
        int userGuess = scan.nextInt();

        //asking the user until user guesses the number
        while (userGuess!=numberToGuess) {
            System.out.println("guess the number");
            userGuess = scan.nextInt();
            if (userGuess > numberToGuess) {
                System.out.println("number is larger");
            } else if (userGuess < numberToGuess) {
                System.out.println("number is smaller");
            } else {
                System.out.println("congrats");
            }

        }
        //homework=flow of the question
    }
}