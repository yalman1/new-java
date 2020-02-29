package methods;

public class reversing {
    public static void reversString (String sentence){
        for (int i=sentence.length()-1; i>=0; i--){
            System.out.print(sentence.charAt(i));
        }
    }
    public static String reverseText (String text){
        String result="";
        for (int i=text.length()-1; i>=0; i--){
            result=result+text.charAt(i);
        }
        return result;
    }
    public static void sayPalindrome (String word){
        String reversedWord =reverseText(word);
        if (reversedWord.equals(word)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }

    }
}
