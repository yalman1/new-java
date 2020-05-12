package java_files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeleteValueInTxt {
    public static void main(String[] args) throws Exception {

            deleteValue("orange", "src/java_files/example.txt");

    }
    public static void deleteValue(String value,String filePath) throws Exception{
        File myFile=new File(filePath);
        Scanner scan = new Scanner(myFile);
        String contentFiltered="";
        String line;
        while(scan.hasNext()){
            line=scan.nextLine();
            if(!line.equals(value)){
                contentFiltered+=line+"\n";
            }
        }
        myFile.delete();
        scan.close();
        FileWriter writer=new FileWriter(filePath);
        writer.write(contentFiltered);
        writer.close();
    }
}
