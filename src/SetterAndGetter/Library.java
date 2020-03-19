package SetterAndGetter;

public class Library {
    private String bookTitle;
    private String bookAuthor;
    private String ISBN;//we assumed some ISBN numbers start with "0"
    private int numberOfPages;
    private boolean available;
    private String barrowDate;
    private String returnDate;
    public Library (String bookTitle,String bookAuthor,String ISBN,int numberOfPages,boolean available,String barrowDate,String returnDate){
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;
        this.ISBN=ISBN;
        this.numberOfPages=numberOfPages;
        this.available=available;
        this.barrowDate=barrowDate;
        this.returnDate=returnDate;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public String getBarrowDate() {
        return barrowDate;
    }
    public void setBarrowDate(String barrowDate) {
        this.barrowDate = barrowDate;
    }
    public String getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    public void borrowBook(String date){
        if(this.available){
            this.available=false;
            String [] arr = date.split("/");
            int month = Integer.parseInt(arr[0]);
            int day = Integer.parseInt(arr[1]);
            if( (month>0 && month<13) && (day>0 && day<32) ){
                this.barrowDate=date;
            }
            else{
                System.out.println("Date is not correct");
            }
        }
        else{
            System.out.println("Book is not available");
        }
    }
    public void returnBook (String date) {
            this.available = true;
            String[] str = date.split("/");
            int month = Integer.parseInt(str[0]);
            int day = Integer.parseInt(str[1]);
            if ((month > 0 && month < 13) && (day > 0 && day < 32)){
            this.returnDate = date;
            }
            else {
                System.out.println("date is not correct");
            }
    }
    @Override
    public String toString() {
        return "Books{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", available=" + available +
                ", barrowDate='" + barrowDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}


