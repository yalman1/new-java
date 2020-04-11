package exceptions;

public class multipleString {
    public static void main(String[] args) {
        String a=null;
        try {
            System.out.println(a.length());
        }
        catch (ArithmeticException e){
            System.out.println("arithmetic");
        }
        /*catch (NullPointerException e){
            System.out.println("null");
        }*/
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array");
        }
        catch (Exception e){
            System.out.println("parent exception occur");
        }
        System.out.println("rest of the code");
    }
}
