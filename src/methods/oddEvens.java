package methods;

public class oddEvens {
    public static void printOdds(int start, int end){
        if (start>end){
            System.out.println("Print count down");
            for (int i=start; i>end; i--){
                if (i%2==1){
                    System.out.println(i);
                }
            }
        }
        else{
            for (int i=start; i<end; i++){
                if (i%2==1) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void printEvens(int start, int end){
        for (int i=start; i<end; i++ ){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
