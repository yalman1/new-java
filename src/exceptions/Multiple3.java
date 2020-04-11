package exceptions;

public class Multiple3 {
    public static void main(String[] args) {
        int a[]=new int[5];
        try{
            a[5]=40/0;
        }
        /*catch (Exception e){
            System.out.println("exception");
        }*/
        catch (ArithmeticException e){
            System.out.println("Arithmetic ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array");
        }
        catch (Exception e){
            System.out.println("exception");
        }
        System.out.println("rest of the code");
    }
}
