package loops;

public class lowerCaseLoop {
    public static void main(String[] args) {
        String sentence = "I Never Forget to Push my Codes to GitHub";
        for (int i=0; i<sentence.length(); i++){
            if (sentence.charAt(i)>97 && sentence.charAt(i)<=122|| sentence.charAt(i)==' '){
                System.out.print(sentence.charAt(i));
            }
        }
    }
}
