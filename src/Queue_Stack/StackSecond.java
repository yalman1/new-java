package Queue_Stack;

import java.util.Stack;

public class StackSecond {
    public static void main(String[] args) {
        System.out.println(isBalanced("{{{}{}}}"));
    }
    public static boolean isBalanced(String braces){
        Stack<Character> curlies = new Stack<>();
        for (int i = 0; i < braces.length() ; i++) {
            curlies.push(braces.charAt(i));
        }
        System.out.println(curlies);
        int numberOfOpen=0;
        int numberOfClose=0;
        char ch;
        for (int i = 0; i < braces.length() ; i++) {
            ch = curlies.pop();
            if (ch=='{'){
                numberOfOpen++;
            }
            else {
                numberOfClose++;
            }
        }
        if(numberOfOpen==numberOfClose){
            return true;
        }
        else{
            return false;
        }

    }
}
