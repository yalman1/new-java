package string_processing;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        System.out.println(convertUppercase("rumeysa"));
        convertUppercase2();

    }
    public static String convertUppercase (String str){
        StringBuilder upper = new StringBuilder(str);

        for(int i = 0 ; i < upper.length() ; i++){
            if(upper.charAt(i) >= 97 && upper.charAt(i) <=122){
                upper.setCharAt(i, (char)(upper.charAt(i)-32));
            }
        }
        return upper.toString();
    }
    public static void  convertUppercase2 (){
        StringBuilder sb=new StringBuilder("yalman");
        int letter;
        for (int i = 0; i <sb.length() ; i++) {
            letter=sb.codePointAt(i);
            letter-=32;
            sb.setCharAt(i,(char)letter);
        }
        System.out.println(sb);
    }

}
