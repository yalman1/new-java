package string_processing;

public class SumNumber {
    public static void main(String[] args) {
        System.out.println(sumNumber("c12hd73"));

    }
    public static int sumNumber (String number) {
        String num = "";
        char ch;
        for (int i = 0; i < number.length(); i++) {
            ch = number.charAt(i);
            if (Character.isDigit(ch)) {
                num += ch;

            }
        }
        int result = Integer.parseInt(num);
        result++;
        return result;
    }

}
