package exceptions;

public class Revision2 {
    public static void main(String[] args) {
        String arr[] ={"asd", null, "def", null, null, "fgh"};
        for (int i = 0; i <arr.length ; i++) {
        try{

            System.out.println(arr[i].charAt(0));

        }
        catch (Exception e) {
            System.out.println("opppps");
            //  e.printStackTrace();
        }
        }
    }
}
