package loops;

public class sandClock {public static void main(String[] args) {
    for (int a=1; a<11; a++){
        for (int b=1; b<=a; b++ ) {
            System.out.print(" ");
        }
        for (int c=a; c<11; c++){
            System.out.print(c+" ");
        }
        System.out.println();

    }
}
}
