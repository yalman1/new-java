package interviewQuestions;

public class Palindrome {
    public static void main(String[] args) {
        String word ="racecar";
        isPalindrome(word);
        System.out.println(isPalindrome1(word));
        System.out.println(isPalindrome2(word));
        System.out.println(isPalindrome3(word));
    }
    public static void isPalindrome (String text){
        String reverse="";
        for (int i=text.length()-1; i>=0; i--){
            reverse=reverse+text.charAt(i);
        }
        if (text.equals(reverse)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
    public static boolean isPalindrome1 (String text){
        if(text=="")
            return false;
        StringBuilder sb=new StringBuilder(text);
        return sb.reverse().toString().equals(text);
    }
    public static boolean isPalindrome2 (String text){
        int head =0;     //first index
        int tail=text.length()-1;    //last index
        while(head<tail){                //check first index with last index
            if (text.charAt(head)!=text.charAt(tail)){    //check each index with charAt
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }
    public static boolean isPalindrome3 (String s){
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    public static boolean isPalindrome4 (String str){
        for (int i = 0, j=str.length()-1; i < j; i++, j--) {
            System.out.println("i = "+i+"\t"+"j = "+j);
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome5 (String str, boolean sb){
        StringBuilder original =new StringBuilder(str);
        StringBuilder reversed =original.reverse();
        if (original.equals(reversed)){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isNumberPalindrome(int number){
        String num = "" + number;
        return isPalindrome4(num);
    }
}
