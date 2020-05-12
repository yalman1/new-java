package java_files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FindingInTxt {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(findMyValue("plum", "example.txt"));
        }
        catch (IOException e){
            System.out.println("oops");
            e.printStackTrace();
        }
    }
    public static String findMyValue(String value,String filePath) throws Exception{
        Scanner scan = new Scanner(new File(filePath));
        String word;
        String result="";
        while(scan.hasNext()){
            word=scan.next();
            if(word.equals(value)){
                result=word;
            }
        }
        return result;
    }
}
