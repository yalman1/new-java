package loops;

public class recTangleDoWhile {
    public static void main(String[] args) {
        int i=0;
        int j;
        do{
            j=0;
            do{
                System.out.print("*");
                j++;
            }
            while(i<20);
            System.out.println();
            i++;
        }
        while(j<10);

    }
}
