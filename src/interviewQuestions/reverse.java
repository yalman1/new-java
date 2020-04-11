package interviewQuestions;

public class reverse {
    public static void main(String[] args) {
        String myStrReverse ="Hello world";
        StringBuilder mystr=new StringBuilder (myStrReverse);
        System.out.println(mystr.reverse());
    }
    public static String reverseString2 (String str){
        String reverse="";
        for (int i =str.length()-1; i <=0 ; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }
    public static void reverseString3 (String str){
        //use charArray
        str="Hello world";
        char [] charArr=str.toCharArray();
        for (int i = charArr.length-1; i <=0; i++) {
            System.out.println(charArr[i]);
        }
    }
}
