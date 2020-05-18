package project1;

import java.util.Scanner;

public class Info {
    public static Book getBookInfo (){

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter Title");
        String title=scan.nextLine();
        System.out.println("Please enter Author");
        String author=scan.nextLine();
        System.out.println("Please enter Publisher");
        String publisher=scan.nextLine();
        System.out.println("Please enter number of pages");
        int pages=scan.nextInt();
        System.out.println("Please enter publish year");
        int year=scan.nextInt();


        Book newBook=new Book(title,author,publisher,pages,year);
        return newBook;
    }
}
