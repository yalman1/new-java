package loops;

public class homework5 {
    public static void main(String[] args) {
        for (int i=1; i<15; i++) {
            for (int j=1; j<i+1; j++)
                System.out.print(" ");

            for (int k=15; k>i; k--)
                System.out.print("*");
            System.out.println();
        }
    }
}
