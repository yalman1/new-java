package string_processing;

public class Replace {
    public static void main(String[] args) {
        System.out.println(replaceVowels("apples",'o'));
        replace();
    }
    public static String replaceVowels(String str,char replacement){
        StringBuilder builder = new StringBuilder(str);
        String vowels = "aeuio";
        for (int i = 0 ; i < builder.length() ; i++) {
            //System.out.println(builder.substring(i));
            if(vowels.contains(builder.substring(i,i+1))){
                System.out.println("OK");
                builder.setCharAt(i,replacement);
            }
        }
        return builder.toString();
    }
    public static void replace (){
        StringBuilder myBuilder = new StringBuilder();
        myBuilder.append(("apples and bananas").replace('a', 'u'));
        System.out.println(myBuilder);

    }

}
