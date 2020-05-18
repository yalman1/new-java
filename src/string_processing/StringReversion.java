package string_processing;

public class StringReversion {
    public static void main(String[] args) {
        String str ="java is fun";
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
