package arrayAndExceptions;

public class exercise {
    public static void main(String[] args) {
        String[][] sen={{"hello how are you"},{"I am fine thank you"}};
        System.out.println(findHowMany(sen));


    }
    public static String findHowMany(String [][] sentence){
        String word="";
        int howMany=1;
        for (int i=0; i<sentence.length; i++) {
            for (int j = 0; j < sentence[i].length; j++) {
                if (word.charAt(i)==' ') {
                   word = sentence[i][j];
                   howMany++;
                }
            }
        }
        return word;
    }
}
