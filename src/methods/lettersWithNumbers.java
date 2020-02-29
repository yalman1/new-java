package methods;

public class lettersWithNumbers {
    public static void printLetters(){
        for (int i=1; i<6; i++){
            System.out.print(i+"."+"\t");
            for (char j=97; j<102; j++ ){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
