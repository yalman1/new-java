package exceptions;

public class exceptionExample {
    public static void main(String[] args) {
        String[] arr = new String[]{"123", "432", "543","abc "};

        try {
            for (int i = 0; i <= arr.length; i++) {
                int j = Integer.parseInt(arr[i]);
                System.out.println(j);
            }
            throw new RuntimeException("This is my illegal argument exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("caught an ArrayIndexOutBoundsException. No Problem");
        }
        catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException. No problem");
        }
        catch (Exception e){
            System.out.println( "Caught Exception. No problem");

        }
    }
}
