package exceptions;

public class MultipleException {
    public static void main(String[] args) {

        int a[]=new int [5];

        try {
            a[5]=10;
            a[5]=30/0;
        }
        catch (ArithmeticException e){

            System.out.println("Arithmetic Exception occur");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds Exception");
        }
        catch (Exception e){
            System.out.println("parent exception occur");
        }
        System.out.println("rest of the code");

    }
}
