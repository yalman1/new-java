package loops;

public class upSideDownTriangle {
    public static void main(String[] args) {

        for(int i=1; i<=10; i++) {                  //numbers of line
            for (int j=10; j >=i; j--) {      //for space
                System.out.print(" ");
            }

            for (int k=1; k<=i; k++) { //for stars
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
