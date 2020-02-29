package methods;

public class removeCharString {
    public static void main(String[] args) {
        removeCharString.removingCharStr("helle", 'e');
    }

    public static String removingCharStr (String text, char letter){
        String removed = "";
        for (int i=0; i<text.length(); i++){
            if (text.charAt(i)!=letter){
                removed+=text.charAt(i);
            }
        }
        return removed;
    }
}
