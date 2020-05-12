package exceptions;

import java.io.File;

public class revision {
    public static void main(String[] args) throws Exception{
        File file=new File("abc.txt");
            file.createNewFile(); //checked exception
       // "abc".charAt(0);    // unchecked exception

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("abcdef".charAt(i));
            }
        }
        catch (Exception e){

        }
    }
}
