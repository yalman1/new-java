package methods;

public class randomNumbersString {
    public static void main(String[] args) {
        String password =generatePassword();
        System.out.println(password);
    }

    public static String generatePassword () {
        String result = "";
        for (int i = 0; i < 6; i++) {
            System.out.print((int) (Math.random() * 10));
        }
        return result;

    }
}
