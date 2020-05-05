package string_processing;

public class RepeatSeparator {
    public static void main(String[] args) {


    }
    public static String repeatSeparator(String word,String sep, int count){
        String result = word;
        for (int i = 0; i < count-1 ; i++) {
            result = word + sep;
        }
        return result;
    }
}
