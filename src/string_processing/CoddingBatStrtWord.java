package string_processing;

public class CoddingBatStrtWord {
    public static void main(String[] args) {
        System.out.println(bringStart("hippo", "hi"));
        System.out.println(bringStart("hippo", "xip"));
        System.out.println(bringStart("hippo", "i"));
    }
    public static String bringStart(String str,String word){
        String start = str.substring(1,word.length());
        String wordExceptFirst = word.substring(1,word.length());
        if(start.equals(wordExceptFirst)){
            return str.substring(0,word.length());
        }
        else {
            return "";
        }
    }
}
