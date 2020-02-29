package loops;

public class stars{
    public static void main(String[] args) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print("*");
            }
            System.out.println();

        }
        int x = 30;
        int y;
        while (x < 3){
            y= 0;
            while (y < 3) {
                System.out.print("*");
                x++;
            }
            System.out.println();
            y++;
        }
    }
}
