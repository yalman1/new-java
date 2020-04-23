package interviewQuestions;

public class Palindrome {
    public static void main(String[] args) {
        String word ="racecar";
        isPalindrome(word);
        System.out.println(isPalindrome1(word));
        System.out.println(isPalindrome2(word));
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
}
