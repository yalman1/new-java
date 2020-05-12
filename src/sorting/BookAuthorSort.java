package sorting;

import java.util.Comparator;

public class BookAuthorSort implements Comparator<Book> {
    public int compare(Book book1, Book book2){
        return book1.getAuthor().compareTo(book2.getAuthor());
    }

}
