package string_processing;

public class DeleteZeros {
    public static void main(String[] args) {
        String number = "000000230432000";
        System.out.println(deleteZeros(number));
    }
    public static String deleteZeros(String numbers){
        StringBuilder str = new StringBuilder(numbers);
        int start=0;
        int end=0;
        for(int i=0 ; i<str.length();i++) {
            if(str.charAt(i)!='0'){
                start=i;
                break;
            }
        }
        for(int i = str.length()-1 ; i>=0 ; i--){
            if(str.charAt(i)!='0'){
                end=i;
                break;
            }
        }
        System.out.println(start+" "+end);
        str.replace(end,str.length(),"");
        str.replace(0,start,"");

        return str.toString();
    }
}
