package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelCounting {
    public static void main(String[] args) {
        String sentence="java is fun";
        vowelCounting(sentence);
        countVC(sentence);
    }
    public static void vowelCounting(String str) {
        int vowel = 0;
        int constant = 0;
        for (int i = 0; i < str.length(); i++) {
            char word = str.charAt(i);
            if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u' ) {
                vowel++;
            }
            else if (word!=' ' || word != 'a' || word != 'e' || word != 'i' || word != 'o' || word != 'u'){
                constant++;
            }
        }
        System.out.println(" Number of vowels:" + vowel+ "Number of constants"+constant);
    }
    public static void countVC(String str) {
        int consonants=0;
        int vowels=0;
        List<Character> vowel= Arrays.asList('a', 'e','i','o','u');
        List<Character> consonant=new ArrayList<>();
        str=str.toLowerCase();
        for (char i='a'; i<'z';i++){
            if(!vowel.contains(i)){
                consonant.add(i);
            }
        }
        for(int i=0;i<str.length();i++)
        {
            if(vowel.contains(str.charAt(i)))
            {
                vowels++;
            }
            else
                consonants++;
        }
        System.out.println("Number of Vowels:" +vowels+ " Number of Consonant: " + consonants);
    }

}
