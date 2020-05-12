package project1;

public class Hangman {
    public static void main(String[] args) {
        String word=HangmanMethods.pickupWord();
        HangmanMethods.displayWord(word);
    }
}