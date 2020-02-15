package First;

public class loopHomework {
    public static void main(String[] args) {

        for (int i=1; i<=10; i++) {
            System.out.print("   "+i);
        }
        System.out.println();
        System.out.print("------------------------------------------");

        System.out.println();
        for(int j=1; j<=10; j++ ) {
            System.out.print(j+":" );

            for (int k=1; k<=10;k++){
                System.out.print(" "+(j*k)+"  ");
            }
            System.out.println('\n');
        }
    }
}
