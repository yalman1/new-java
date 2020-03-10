package revision;

public class replace {

    public static void main(String[] args) {
        System.out.println(removeSpace("it is a perfect day to study Java","-"));
    }
    public static String removeSpace (String sentence, String replace){
        String result="";
        for (int i=0; i<sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                result+=sentence.charAt(i);
            }
            else {
                result+=replace;
            }
        }
        return result;
    }
}
