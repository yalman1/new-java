package methods;

public class numbersPrinting {
    public static void printNums(){
        int number=1;
        for (int i=0; i<3; i++){
            for (int j=0; j<5; j++){
                System.out.print(number+"\t");
                number++;
            }
            System.out.println();
        }
    }
}
