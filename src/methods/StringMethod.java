package methods;

public class StringMethod {
    public static void main(String[] args) {
        passCheck("qwerty");        //1
        String check=passwordCheck("asdf");     //2
        System.out.println(check);
        System.out.println(isPasswordGood("asdfghjk"));    //3
        String password ="1234905";
        if (isPasswordGood(password)){
            System.out.println("Length is OK");
        }

    }
    public static void passCheck(String password){     //1.parameter. void
        if (password.length()<6){
            System.out.println("NOT OK");
        }
        else {
            System.out.println("OK");
        }
    }
    public static String passwordCheck(String password){     //2 parameter. return
        String result;
        if (password.length()>=6){
            result = "OK";
        }
        else{
            result ="NOT OK";
        }
        return result;
    }
    public static boolean isPasswordGood (String password){     // 3.parameter. return
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


