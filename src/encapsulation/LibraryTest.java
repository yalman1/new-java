package encapsulation;

public class LibraryTest {
    public static void main(String[] args) {
        Library books=new Library("Winnie the pooh", "Milne Sheppard", "0046378560",50,true, "","");
        System.out.println(books.toString());
        books.borrowBook("3/18/2020");
        System.out.println(books.getBarrowDate());
        System.out.println(books.isAvailable());
        books.borrowBook("3/18/2020");
        books.returnBook("3/23/2020");
        System.out.println(books.isAvailable());
        System.out.println(books.getBarrowDate());


    }
}
