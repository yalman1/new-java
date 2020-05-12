package java_files;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws Exception{
        FileWriter writer =new FileWriter("data.txt");
        writer.write("Chips \t $2.99\n");
        writer.write("Apple \t $1.19\n");
        writer.write("Candy \t $1.99\n");
        writer.close();
        File read =new File("data.txt");
        Scanner scaner=new Scanner(read);
        while (scaner.hasNext()){
            System.out.println(scaner.nextLine());
        }
        //Print only product starts with A
        scaner.close();
        Scanner scan=new Scanner(read);
        String line;
        while (scan.hasNext()) {
            line = scan.nextLine();
            if (line.charAt(0) == 'A') {
                System.out.println(line);
            }
        }
        scaner.close();
        // Print total number of chars
       Scanner scan1=new Scanner(read);
       int totalChars=0;
       while (scan1.hasNext()){
           totalChars +=scan1.nextLine().length();
       }
        System.out.println("Total chars : "+totalChars);
        scan1.close();

        //Print total number of products
        Scanner scan2=new Scanner(read);
        int totalProduct=0;
        while (scan2.hasNext()){
            scan2.nextLine();
            totalProduct++;
        }
        System.out.println("Total product : "+totalProduct);
        scan2.close();
    }
}
