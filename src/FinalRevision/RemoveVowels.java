package FinalRevision;

import java.util.HashSet;

public class RemoveVowels {
    public static void main(String[] args) {
        String sentence ="I have a job I enjoy and it pays well";
        sentence=removeDuplicates(sentence);
        sentence=removeSpaces(sentence);

    }
    public static boolean isVowel (char ch){
        ch=Character.toLowerCase(ch);
        if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
            return true;
        }
        else {
            return false;
        }
    }
    public static String removeDuplicates (String word){
        HashSet<Character> hs=new HashSet<>();
        for (int i = 0; i <word.length() ; i++) {
            hs.add(word.charAt(i));
        }
        return hs.toString();
    }
    public static String removeSpaces(String word){
        String result="";
        for (int i = 0; i <word.length() ; i++) {
            if(word.charAt(i)!=' '){
                result +=word.charAt(i);
            }
        }
        return result;
    }
}
