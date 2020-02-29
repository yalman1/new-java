package loops;

public class triangleWhile {
    public static void main(String[] args) {
        int y=0;
        int j;
        while (y<8) {
            j = 0;
            while (j<=y) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            y++;
        }
    }
}
