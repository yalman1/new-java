package exceptions;

public class Multiple2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        try {
            System.out.println(arr[10]);
        }
        catch (ArithmeticException e){
            System.out.println("arithmetic exception occur");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" Array index out of bounds exception");
        }
        catch (NullPointerException e){
            System.out.println("null pointer exception");
        }
        catch (Exception e){
            System.out.println("exception occur");
        }
        System.out.println("rest of the code");
    }
}
