package revision;

public class DecideAcceptOrReject {
    public static void main(String[] args) {
        String ourSentence="It Is Time To Review";
        countCapitals(ourSentence);
        System.out.println(countAllCapitals(ourSentence));
    }
    public static void countCapitals(String sentence){
        int counter=0;
        for(int i=0 ; i<sentence.length();i++){
            if(sentence.charAt(i)>64 && sentence.charAt(i)<92){
                counter++;
            }
        }
        System.out.println("Total there are "+counter+" capital letters");
    }
    public static int countAllCapitals(String sentence){
        int numberOfCapitals =0;
        for(int i=0 ; i<sentence.length();i++){
            if(sentence.charAt(i)>64 && sentence.charAt(i)<92){
                numberOfCapitals++;
            }
        }
        return numberOfCapitals;
    }
}
