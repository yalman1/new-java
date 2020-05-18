package project1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class BookShelf {
    public static void main(String[] args) throws IOException {
       // Book book=new Book("aa","bb","c",300,2000);
       // System.out.println(book.lost);

        BookFile books=new BookFile("Book.txt");
       // books.createFile();
        books.addBook(new Book("Harry potter", "J K Rowling", "Some",500, 2000));
        Menu bs=new Menu("Book shelf" , new ArrayList<>(Arrays.asList("Add new Book","List All Books", "List Lost book")));
        bs.displayMenu();

    }
}
