package methods;

public class randomnumbers {
    public static void main(String[] args) {
        int count=0;
        while (count<20) {
            generatePassWord();
            count++;
        }
    }
    public static void generatePassWord(){
        for (int i=0; i<6; i++){
            System.out.print((int)(Math.random()*10));
        }
        System.out.println();
    }

}
