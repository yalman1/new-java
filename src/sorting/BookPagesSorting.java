package sorting;

import java.util.Comparator;

public class BookPagesSorting implements Comparator<Book> {
    public int compare(Book book1, Book book2){
        if(book1.getPages()==book2.getPages()){
            return 0;
        }
        else if(book1.getPages()>book2.getPages()){
            return 1;
        }
        else {
            return -1;
        }
    }

}
