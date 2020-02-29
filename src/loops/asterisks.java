package loops;

public class asterisks {
    public static void main(String[] args) {

        for (int row=0; row<6; row++){
            for (int col=0; col<8; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int r=0; r<8; r++){
            for (int c=0; c<(r+1); c++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
