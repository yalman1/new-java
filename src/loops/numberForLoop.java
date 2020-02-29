package loops;

public class numberForLoop {
    public static void main(String[] args) {

        for (int i=1; i<=9; i++){

            for(int j=0; j<=9; j++ ){
                System.out.print(i);        //System.out.println(i+""+j);
                System.out.print(j);        // ln is also solution
                System.out.println();
            }
        }
        // same question with while
        int tens=1;
        int ones;
        while (tens<=9){
            ones=0;
            while(ones<=9){
                System.out.println(""+ones+tens);
                ones++;
            }
            tens++;
        }
    }
}
