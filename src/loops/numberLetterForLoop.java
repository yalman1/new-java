package loops;

public class numberLetterForLoop {
    public static void main(String[] args) {
        char letter='a';
        for(int i=1; i<=5; i++) {
            System.out.print(i+"\t");

            for (int j = 1; j <= 4; j++) {
                System.out.print(letter+"\t");
                letter++;
            }
            System.out.println();
        }
        // with while
        int numbers=1;
        int count;
        char letters='a';
        while (numbers<6) {
            System.out.print(numbers+"\t");
            count =0;
            while (count<4) {
                System.out.print(letters+"\t");
                count++;
                letters++;
            }
            System.out.println();
            numbers++;
        }
    }
}
