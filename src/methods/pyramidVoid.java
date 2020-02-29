package methods;

public class pyramidVoid {
    public static void pyramid (int numberOfLines){
        for (int i=0; i<numberOfLines; i++){
            for ( int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pyramid(10);
        pyramid(5);
        pyramid(3);
    }
}
