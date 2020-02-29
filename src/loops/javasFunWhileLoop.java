package loops;

public class javasFunWhileLoop {
    public static void main(String[] args) {
        String sentence = "Sunday is fun day";
        //System.out.println(sentence.length());
        int index = 0;
        while (index < sentence.length()) {
            if (sentence.charAt(index) == 'u' || sentence.charAt(index) == 'a' || sentence.charAt(index) == 'i') {
                System.out.println(sentence.charAt(index));
            }
            else {
                System.out.println("consonant");

            }
            index++;
        }
    }
}
