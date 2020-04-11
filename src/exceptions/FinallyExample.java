package exceptions;

public class FinallyExample {

    public static void main(String[] args) {
        try {
            System.out.println(6/0);
          //  System.out.println(6/2);
        }
        catch (Exception e){
            System.out.println("Oooops ");
        }
        finally {
            System.out.println("I will run this code what ever it takes ");
        }
    }
}
