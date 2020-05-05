package string_processing;

public class StrongPassword {
    public static void main(String[] args) {
        System.out.println(countLower("Abc$3s4"));
    }
    public static int countDigits(String password){
        String numbers = "0123456789";
        int count=0;
        for (int i = 0 ; i < password.length() ; i++) {
            if(numbers.contains(password.substring(i,i+1))){
                count++;
            }
        }
        return count;
    }
    public static int countLower(String password){
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        int count=0;
        for (int i = 0; i < password.length() ; i++) {
            if(lower_case.contains(password.substring(i,i+1))){
                count++;
            }
        }
        return count;
    }
    public static int countUpper(String password){
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int count=0;
        for (int i = 0; i < password.length() ; i++) {
            if(upper_case.contains(password.substring(i,i+1))){
                count++;
            }
        }
        return count;
    }
    public static int countSpecial(String password){
        String special_characters = "!@#$%^&*()-+";
        int count=0;
        for (int i = 0; i < password.length() ; i++) {
            if(special_characters.contains(password.substring(i,i+1))){
                count++;
            }
        }
        return count;
    }

    public static int checkMyPassword(String password){
        if(password.length()<6){
            return 6-password.length();
        }
        else {
            return 0;
        }
    }
}
