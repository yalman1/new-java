package project1;

import java.util.Scanner;

public class MemoryPuzzle {
    public static void main(String[] args) {
        String puzzle[][] = {
                {"@", "@", "&", "&"},
                {"%", "%", "#", "#"},
                {"X", "X", "$", "$"},
        };
        int status[][] = new int[puzzle.length][puzzle[0].length];
        //status[0][1]=1;

        Scanner scanner = new Scanner(System.in);

        char letter = 'a';
        System.out.println("\t1\t2\t3\t4\t");
        for (int i = 0; i < puzzle.length; i++) {
            System.out.print(letter + "\t");
            for (int j = 0; j < puzzle[0].length; j++) {
                if (status[i][j] == 0) {
                    System.out.print("*\t");
                } else {
                    System.out.print(puzzle[i][j] + "\t");
                }
            }
            System.out.println();
            letter++;
        }
        String location;
        int loc[] = {0, 0};
        String loc1, loc2;
        System.out.print("First location : ");
        location = scanner.next();
        loc[0] = (int) (location.charAt(0) - 97);
        loc[1] = (int) (location.charAt(1) - 49);
        loc1 = puzzle[loc[0]][loc[1]];
        System.out.println(loc1);

    }
}
