package string_processing;

public class StringContainsOnlyDigit {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("12345");
        System.out.println(isAllDigits(sb));

    }
    public static boolean isAllDigits (StringBuilder str){
        boolean result=true;

        for (int i = 0; i <str.length() ; i++) {
            if (!(str.charAt(i)>=48&& str.charAt(i)<=57)) {
                result= false;
            }
        }
        return result;
    }
}
