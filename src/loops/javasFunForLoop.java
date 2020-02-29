package loops;

public class javasFunForLoop {
    public static void main(String[] args) {
        String myStr="java is fun" ;

        for(int index=0; index<myStr.length(); index++) {

            if (myStr.charAt(index)=='a'|| myStr.charAt(index)=='i' || myStr.charAt(index)=='u') {

                System.out.println(myStr.charAt(index));
            }
        }
    }
}
