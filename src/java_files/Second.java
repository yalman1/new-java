package java_files;

import java.io.File;
import java.io.IOException;

public class Second {
    public static void main(String[] args) {
        try {
            File myFile = new File("rumeysa.txt");
            if (myFile.createNewFile()){
                System.out.println("File created "+myFile);
            }
            else{
                System.out.println("File already exist ");
            }
        }
        catch (IOException e){
            System.out.println(e);

        }

    }
}
