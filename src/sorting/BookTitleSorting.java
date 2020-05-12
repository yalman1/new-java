package sorting;

import java.util.Comparator;

public class BookTitleSorting implements Comparator<Book> {
    public int compare(Book book1, Book book2){
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
