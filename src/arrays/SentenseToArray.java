package arrays;

public class SentenseToArray {
    public static void main(String[] args) {
        String sentence = "We are in love with Java";
        System.out.println(findNumberOfWords(sentence));
        System.out.println();
        String [] resultArray = convertStringToArray(sentence);
        for(String word:resultArray){
            System.out.println(word);
        }
    }
    public static int findNumberOfWords(String sentence){
        int counter=1;
        for(int i=0 ; i<sentence.length();i++){
            if (sentence.charAt(i)==' '){
                counter++;
            }
        }
        return counter;
    }
    public static String[] convertStringToArray(String sentence){
        sentence+=" ";
        int numWords = findNumberOfWords(sentence);
        String[] result = new String[numWords];
        String word="";
        int index=0;
        for(int j=0 ; j<sentence.length() ; j++) {
            word += sentence.charAt(j);
            if (sentence.charAt(j) == ' ') {
                result[index] = word;
                index++;
                word="";
            }
        }
        return result;
    }
}
