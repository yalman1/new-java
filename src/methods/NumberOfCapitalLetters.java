package methods;

public class NumberOfCapitalLetters {
    public static void main(String[] args) {
        String ourSentence ="It Is Time For Review";
        findCapitalLetter(ourSentence);

    }
    public static void findCapitalLetter(String  letters){
        int counter =0;
        for (int i=0; i<letters.length(); i++){
            if (letters.charAt(i)>64 && letters.charAt(i)<92){
                counter++;
            }
        }
        System.out.println("Total there are "+counter+"  capital letters");
    }

}
