package methods;

public class topToBottom {
    public static void main(String[] args) {
        printVertical("hello");
    }
    public static void printVertical (String text){
        for (int i=0; i<text.length(); i++ ){
            System.out.println(text.charAt(i));
        }
    }
}
