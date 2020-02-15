package First;

public class NestedLoopExample {
    public static void main(String[] args) {
        for (int i=0; i<1;i++){
            System.out.print("hello ");

            for(int j=10; j<14; j++){
                System.out.println("world ");
            }
        }
        System.out.println();
        for (int i=1; i<1; i++){
            for(int j=0; j<3; j++){
            System.out.print("world ");
        }
            System.out.print("hello ");}
    }
}
