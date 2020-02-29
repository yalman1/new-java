package loops;

public class DownTriangle {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 10; y >= x; y--) {   //y=1; y<=x; y++
                System.out.print("* ");
            }
            System.out.println();
        }
        //wile loop
        int a=0;
        int b;

        while (a<=10){
            b=10;
            while(b >= a){
                System.out.print("* ");
                b--;
            }
            System.out.println();
            a++;
        }



    }
}
