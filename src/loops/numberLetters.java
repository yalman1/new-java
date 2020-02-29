package loops;

public class numberLetters {
    public static void main(String[] args) {
        for (int i=1; i<6; i++){
            System.out.print(i+". ");
            for (char letter='a'; letter<='e'; letter++){
                System.out.print("\t"+letter+"\t");
            }
            System.out.println();
        }
        System.out.println("_______________________________");
        // other way
        char letter;
        for (int i=1; i<=5; i++){
            System.out.print(i+". ");
            letter=97;
            while (letter<102){
                System.out.print(letter+"\t\t");
                letter++;
            }
            System.out.println();
        }
    }
}
