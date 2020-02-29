package methods;

public class removeChar {
    public static void removingChar (String text, char letter){

        for (char i=0;  i<text.length(); i++ ){
            if (text.charAt(i)!=letter){
                System.out.print(text.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        removeChar.removingChar("Java is fun", 'a');
    }

}
