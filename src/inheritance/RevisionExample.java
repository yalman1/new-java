package inheritance;

public class RevisionExample {
    public static void main(String[] args) {
        Dictionary dictionary=new Dictionary(500, 5000);
        Book book= (Book)dictionary;     // UP CASTING :conveting child object to parent object
        dictionary.lookUp();
        book.read();
        System.out.println(dictionary.words);
        System.out.println(book.pages);
    }
}
class Book{
    int pages;
    public Book(int pages) {
        this.pages = pages;
    }
    void read (){
        System.out.println("Reading");
    }
}
class Dictionary extends Book{
    int words;
    public Dictionary(int pages, int words) {
        super(pages);
        this.words = words;
    }
    void lookUp (){
        System.out.println("Looking up");
    }
}
