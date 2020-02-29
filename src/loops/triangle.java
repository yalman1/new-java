package loops;

public class triangle {
    public static void main(String[] args) {
        for (int x=0; x<8; x++ ){
            for ( int y=0; y<(x+1); y++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
