package java_files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingTwo {
    public static void main(String[] args) {
        try{
            FileWriter myWriter =new FileWriter("rumeysa.txt");
            myWriter.write("End of java class, ");
            myWriter.write("it was tiring ");
            myWriter.write("but fun.");
            myWriter.close();

        }
        catch (IOException e){
            System.out.println("oops");
            e.printStackTrace();
        }
    }
}
