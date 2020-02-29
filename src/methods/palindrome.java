package methods;

public class palindrome {
    public static boolean isPalindrome (String text) {
        boolean result = true;
        int end = text.length() - 1;
        for (int i = 0; i < text.length(); i++){

            if (text.charAt(i) != text.charAt(end)) {
                result = false;
            }
            end--;
        }
        return result;
    }
}
