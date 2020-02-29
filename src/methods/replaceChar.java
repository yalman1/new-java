package methods;

public class replaceChar {
    public static void replacingChar(String text, char toReplaced, char toReplace) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == toReplaced) {
                System.out.print(toReplace);
            } else {
                System.out.print(text.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        replaceChar.replacingChar("java is fun",'a', 'e' );
    }

}
