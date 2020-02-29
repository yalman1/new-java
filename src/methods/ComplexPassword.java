package methods;

public class ComplexPassword {
    public static void main(String[] args) {
        int count=0;
        do {
            password();
            System.out.println();
            count++;
        }
        while (count<50);

    }
    public static void password (){
        // to generate 3 digit number
        for (int i=0; i<3; i++) {
            System.out.print((int) (Math.random() * 10));
        }
        // to generate 3 digit letter
        for (int j=0; j<3; j++ ){
            System.out.print((char)((int)(Math.random()*26+97)));
        }
    }
}
