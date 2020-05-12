package java_files;

import java.io.File;
import java.util.Scanner;

public class FileReadingTwo {
    public static void main(String[] args) {
        try {
            File myFile = new File("rumeysa.txt");
            Scanner scan=new Scanner(myFile);
            while (scan.hasNext()){
                System.out.println(scan.nextLine());
            }

        }
        catch (Exception e){
            System.out.println("ooops");
            e.printStackTrace();
        }
    }

}
