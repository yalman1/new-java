package constructor;

import constructor.StringOperations;

import java.util.Arrays;

public class StringOperrationsTest {

    public static void main(String[] args) {
        StringOperations myStr = new StringOperations("java is super fun");
        System.out.println(myStr.returnReversed());
        System.out.println(myStr.returnCapitalized());
        System.out.println(Arrays.toString(myStr.returnString()));
        System.out.println(Arrays.toString(myStr.returnSentence()));
    }

}
