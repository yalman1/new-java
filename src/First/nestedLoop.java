package First;

public class nestedLoop {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            for (int j=0; j<6; j++){
                System.out.println("hello world");
            }
        }
        for (int i=0; i<5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("i" + i + "j" + j);
            }
        }
    }
}
