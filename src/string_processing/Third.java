package string_processing;

public class Third {
    public static void main(String[] args) {
        StringBuilder myStr=new StringBuilder("Mumeysa");
        myStr.setCharAt(0,'R');
        System.out.println(myStr);
        System.out.println(myStr.codePointCount(3, 7));
        System.out.println(myStr.codePointAt(4));
    }
}
