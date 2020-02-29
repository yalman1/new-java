package methods;

public class replaceCharString {
    public static String replacingCharString (String text, char lookup, char newChar){
        String replaced="";
        for (int i=0; i<text.length(); i++){
            if (text.charAt(i)==lookup){
                replaced+=newChar;
            }
            else {
                replaced+=text.charAt(i);
            }
        }
        return replaced;
    }

    public static void main(String[] args) {
        String newString = replaceCharString.replacingCharString("hello", 'o', 'a');
        System.out.println(newString);
    }
}
