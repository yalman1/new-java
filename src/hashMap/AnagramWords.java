package hashMap;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramWords {
    public static void main(String[] args) {
        System.out.println(isAnagram("cat","cat"));
        String words[]={"cat", "cta","car","care","atc"};
        findAnagrams(words);
        String word1="abcd";
        String word2="dcba";
        findAnagramsSort(word1,word2);

    }
    public static void findAnagramsSort (String words1, String words2){

        char[] chars1=words1.toCharArray();
        char [] chars2=words2.toCharArray();
        Arrays.sort(chars1);
        //System.out.println(Arrays.toString(chars1));
        Arrays.sort(chars2);
        //System.out.println(Arrays.toString(chars2));
        boolean isAnagram= true;
        for (int i=0; i<chars1.length; i++){
            if(chars1[i]!=chars2[i]){
                isAnagram=false;
                break;
            }
        }
        if (isAnagram){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
    public static void findAnagrams (String arr[]){
        for (int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(i!=j){
                    if(isAnagram(arr[i], arr[j])){
                        System.out.println("\""+arr[i]+"\""+" and "+"\""+arr[j]+"\""+" are anagrams");
                    }
                }
            }
        }
    }
    public static boolean isAnagram(String word1, String word2){
        if (word1.length()!=word2.length()){
            return false;
        }
        else {
            HashMap<Character, Integer > map1 =new HashMap<>();
            HashMap<Character, Integer > map2 =new HashMap<>();
            for (int i=0; i<word1.length(); i++){
                if (map1.containsKey(word1.charAt(i))) {
                    map1.put(word1.charAt(i), map1.get(word1.charAt(i)) + 1);
                }
                else {
                    map1.put(word1.charAt(i),1);
                }
                if (map2.containsKey(word2.charAt(i))){
                    map2.put(word2.charAt(i), map2.get(word2.charAt(i))+1);
                }
                else {
                    map2.put(word2.charAt(i),1);
                }
            }
            if (map1.equals(map2)){
                return true;
            }
            else {
                return false;
            }
        }
    }
}
