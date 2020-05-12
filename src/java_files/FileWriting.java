package java_files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("first.txt");
            myWriter.write("Java is super fun. it is even better\n");
            myWriter.write("Java is super fun. it is even better\n");
            myWriter.write("Java is super fun. it is even better\n");
            myWriter.close();
        }
        catch (IOException e){
            System.out.println("oops");
            e.printStackTrace();
        }
    }
}
