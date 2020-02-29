package methods;

public class StringMethod {
    public static void main(String[] args) {
        passCheck("qwerty");
        String check=passwordCheck("asdf");
        System.out.println(check);
        System.out.println(isPasswordGood("asdfghjk"));
        String password ="1234905";
        if (isPasswordGood(password)){
            System.out.println("Length is OK");
        }

    }
    public static void passCheck(String password){     //void method
        if (password.length()<6){
            System.out.println("NOT OK");
        }
        else {
            System.out.println("OK");
        }
    }
    public static String passwordCheck(String password){
        String result;
        if (password.length()>=6){
            result = "OK";
        }
        else{
            result ="NOT OK";
        }
        return result;
    }
    public static boolean isPasswordGood (String password){
        boolean result;
        if (password.length()<6){
            result = false;
        }
        else {
            result = true;
        }
        return result;
    }
}


