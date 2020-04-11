package exceptions;

public class NextLettertest {
    public static void main(String[] args) {
        NextLetter letter =new NextLetter ();
        System.out.println(letter.sentence);
        letter.printNextLetters();
        NextLetter letter2 =new NextLetter("java is fun");
        System.out.println(letter2.sentence);
        letter2.printNextLetters();
    }
}
