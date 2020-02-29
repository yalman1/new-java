package methods;

public class randomLetters{
    public static void main(String[] args) {
        letters(8);
        System.out.println();
        System.out.println(generateLettersPass(6));
    }

    public static void  letters(int passlen) {
        for (int i=0; i<passlen; i++ ){

            System.out.print((char) (97+(int) (Math.random()*26)));
        }

    }
    public static String generateLettersPass (int passLenghth){
        String result="";
        for (int i=0; i<passLenghth; i++){
            result =result +(char)(97+(int)(Math.random()*26));
        }
        return result;
    }
}
