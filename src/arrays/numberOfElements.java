package arrays;

public class numberOfElements {
    public static void main(String[] args) {
        String [] letters={"abc", "defgh","qwerty", "asd"};
        int counter=0;
        for (int i=0; i<letters.length; i++){
            if(letters[i].length()<4) {
               counter++;
                System.out.println(letters[i]);
            }
        }
        System.out.println(counter );


    }
}
