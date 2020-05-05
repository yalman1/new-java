package string_processing;

public class CamelCaseCount {
    public static void main(String[] args) {
        String word="SaveChangesInTheEditor";
        System.out.println(count(word));
    }
    public static int count (String var){
        int count =1;
        StringBuilder sb=new StringBuilder(var);
        for (int i = 0; i <sb.length() ; i++) {
            if(sb.codePointAt(i)>=65 && sb.codePointAt(i)<=92){
                count++;
            }
        }return count;
    }
}
