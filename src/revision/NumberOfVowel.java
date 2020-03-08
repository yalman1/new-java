package revision;

public class NumberOfVowel {
    public static void main(String[] args) {
        String sentence="java is my sweetheart" ;
        int sen=0;

        for(int i=0; i<sentence.length(); i++) {
            char word=sentence.charAt(i);
            boolean check =word=='a' || word =='i'|| word =='e'|| word=='o'||word=='u';
            if (check) {
                sen++;
            }
        }
        System.out.println(sen);

    }
}
